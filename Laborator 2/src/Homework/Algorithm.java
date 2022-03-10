package Homework;

/**
 * The algorithm generate the solution for the problem, meaning it will assign a Room for every Event
 */
public abstract class Algorithm {
    /**
     * Assigns rooms for each event such that there are not overlapping events for the same room in the same time.
     * First it sorts the events and rooms by size and capacity.
     * Then it iterates through every event and for each event it iterates through every room.
     * It verifies if the Event size fits the room capacity. If yes then it verifies if the room is available and adds it to assignedRooms.
     * @param problem Contains allEvents and allRooms
     * @param assignedRooms Contains the rooms assigned for each Event
     */
    protected static void assignEventsToRooms(Problem problem, RoomH[] assignedRooms) {
        sortEventsBySizeDesc(problem);
        sortRoomsByCapacityDesc(problem);

        int n = problem.allEvents.length;
        int m = problem.allRooms.length;

        for (int eventIndex = 0; eventIndex < n; eventIndex++) {
            boolean roomFound = false;
            for (int roomIndex = 0; roomIndex < m && !roomFound; roomIndex++) {
                if (problem.allEvents[eventIndex].getSize() <= problem.allRooms[roomIndex].getCapacity()) {
                    if (isRoomAvailable(eventIndex, roomIndex, problem, assignedRooms)) {
                        assignedRooms[eventIndex] = problem.allRooms[roomIndex];
                        roomFound = true;
                    }
                }
            }
        }

        printEventsAssignedToRooms(problem,assignedRooms);
    }


    /**
     * It iterates through every room in assignedRooms
     * and verifies if there are other events that have the room at the position roomIndex assigned at the moment of time.
     * @param eventIndex Is the index of the current event in the method assignEventsToRooms
     * @param roomIndex Is the index of the current room in the method assignEventsToRooms
     * @param problem Contains allEvents and allRooms
     * @param assignedRooms Contains the rooms assigned for each Event.If none then the values are null.
     * @return true if the room is available, false otherwise
     */
    private static boolean isRoomAvailable(int eventIndex, int roomIndex, Problem problem, RoomH[] assignedRooms) {
        EventH[] event = problem.allEvents;

        for (int i = 0; i < assignedRooms.length; i++) {
            boolean theRoomsNameAreEqual;

            if (assignedRooms[i] != null && assignedRooms[roomIndex] != null) {
                theRoomsNameAreEqual = assignedRooms[i].getName().equals(assignedRooms[roomIndex].getName());
                if (theRoomsNameAreEqual) {

                    if (event[i].getStart() == event[eventIndex].getStart() || event[i].getEnd() == event[eventIndex].getEnd())
                        return false; // [8,10] = [8,10]

                    if (event[i].getStart() < event[eventIndex].getStart())
                        if (event[i].getEnd() > event[eventIndex].getEnd())
                            return false; // [8,14] <- [10,12]

                    if (event[i].getStart() > event[eventIndex].getStart())
                        if (event[i].getEnd() < event[eventIndex].getEnd())
                            return false; // [10,12] -> [8,14]
                }
            }
        }

        return true;
    }

    /**
     * The events will be sorted descending by size
     * @param problem Contains allEvents and allRooms
     */
    private static void sortEventsBySizeDesc(Problem problem) {
        int n = problem.allEvents.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (problem.allEvents[j].getSize() < problem.allEvents[j + 1].getSize()) {
                    EventH temp = problem.allEvents[j];
                    problem.allEvents[j] = problem.allEvents[j + 1];
                    problem.allEvents[j + 1] = temp;
                }
    }

    /**
     * The rooms will be sorted descending by capacity
     * @param problem Contains allEvents and allRooms
     */
    private static void sortRoomsByCapacityDesc(Problem problem) {
        int n = problem.allRooms.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (problem.allRooms[j].getCapacity() < problem.allRooms[j + 1].getCapacity()) {
                    RoomH temp = problem.allRooms[j];
                    problem.allRooms[j] = problem.allRooms[j + 1];
                    problem.allRooms[j + 1] = temp;
                }
    }


    /**
     * Prints every event and the room that is assigned to it.
     * @param problem Contains allEvents and allRooms
     * @param assignedRooms Contains the rooms assigned for each Event
     */
    private static void printEventsAssignedToRooms(Problem problem, RoomH[] assignedRooms){
        for (int i = 0; i < problem.allEvents.length; i++)
            System.out.println(problem.allEvents[i].getName() + "->" + assignedRooms[i].getName());
    }
}
