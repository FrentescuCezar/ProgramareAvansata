package Homework;

public abstract class Algorithm {
    protected static void assignEventToRoom(Problem problem, RoomH[] assignedRooms) {
        orderEventsBySizeDesc(problem);
        orderRoomsByCapacityDesc(problem);

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

        System.out.println(problem);

        for (RoomH room : assignedRooms) {
            System.out.println(room);
        }
    }

    private static boolean isRoomAvailable(int eventIndex, int roomIndex, Problem problem, RoomH[] assignedRooms) {
        EventH[] event = problem.allEvents;

        for (int i = 0; i < assignedRooms.length; i++) {
            boolean theRoomsNameAreEqual;

            if(assignedRooms[i] != null && assignedRooms[roomIndex] != null){
                theRoomsNameAreEqual = assignedRooms[i].getName().equals(assignedRooms[roomIndex].getName());
                if (theRoomsNameAreEqual) {

                    if (event[i].getStart() == event[eventIndex].getStart() || event[i].getEnd() == event[eventIndex].getEnd())
                        return false; // [8,10] [8,10]

                    if (event[i].getStart() < event[eventIndex].getStart())
                        if (event[i].getEnd() > event[eventIndex].getEnd())
                            return false; // [8,14] [10,12]

                    if (event[i].getStart() > event[eventIndex].getStart())
                        if (event[i].getEnd() < event[eventIndex].getEnd())
                            return false; // [10,12] [8,14]
                }
            }
        }
        return true;
    }

    private static void orderEventsBySizeDesc(Problem problem) {
        int n = problem.allEvents.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (problem.allEvents[j].getSize() < problem.allEvents[j + 1].getSize()) {
                    EventH temp = problem.allEvents[j];
                    problem.allEvents[j] = problem.allEvents[j + 1];
                    problem.allEvents[j + 1] = temp;
                }
    }
    private static void orderRoomsByCapacityDesc(Problem problem) {
        int n = problem.allRooms.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (problem.allRooms[j].getCapacity() < problem.allRooms[j + 1].getCapacity()) {
                    RoomH temp = problem.allRooms[j];
                    problem.allRooms[j] = problem.allRooms[j + 1];
                    problem.allRooms[j + 1] = temp;
                }
    }

}
