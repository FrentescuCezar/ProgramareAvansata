package Homework;

import java.util.Arrays;


/**
 * Clasa Problem va contine toate evenimentele si camerele fara duplicate.
 **/
public class Problem {
    EventH[] allEvents;
    RoomH[] allRooms;


    /**
     * setAllEvent va prelua evenimente dintr-o lista si va adauga in allEvents doar evenimente unice/neduplicate.
     * Initial se vor adauga si elemente null, cele care sunt duplicate, dar apoi se va aloca un nou array care sa stocheze doar elementele nenule.
     * @param events
     */
    public void setAllEvents(EventH... events) {
        EventH[] auxEvents = new EventH[events.length];

        int index = 0;
        for (int i = 0; i < events.length; i++) {
            boolean duplicateEventFound = false;
            //innermost loop to make comparision between elemnts and skip duplicate elements
            for (int j = 0; j < i; j++) {
                if (events[i].equals(events[j])) {
                    duplicateEventFound = true;
                    break;
                }
            }
            if (duplicateEventFound == false) {
                auxEvents[index] = events[i];
                index++;    //increment index value
            }
        }

        int counterNotNullElements = 0;
        for (EventH event : auxEvents) {
            if (event != null)
                counterNotNullElements++;
        }

        EventH[] auxEventsNotNull = new EventH[counterNotNullElements];
        for (int i = 0; i < auxEvents.length; i++) {
            if (auxEvents[i] != null)
                auxEventsNotNull[i] = auxEvents[i];
        }

        allEvents = auxEventsNotNull;
    }

    /**
     * setAllEvent va prelua camerele dintr-o lista si va adauga in allEvents doar camerele unice/neduplicate.
     * Initial se vor adauga si elemente null, cele care sunt duplicate, dar apoi se va aloca un nou array care sa stocheze doar elementele nenule.
     * @param rooms
     */
    public void setAllRooms(RoomH... rooms) {
        RoomH[] auxRooms = new RoomH[rooms.length];

        int index = 0;
        for (int i = 0; i < rooms.length; i++) {
            boolean duplicateRoomFound = false;
            //innermost loop to make comparision between elemnts and skip duplicate elements
            for (int j = 0; j < i; j++) {
                if (rooms[i].equals(rooms[j])) {
                    duplicateRoomFound = true;
                    break;
                }
            }
            if (duplicateRoomFound == false) {
                auxRooms[index] = rooms[i];
                index++;    //increment index value
            }
        }

        int counterNotNullElements = 0;
        for (RoomH room : auxRooms) {
            if (room != null)
                counterNotNullElements++;
        }

        RoomH[] auxRoomsNotNull = new RoomH[counterNotNullElements];
        for (int i = 0; i < auxRooms.length; i++) {
            if (auxRooms[i] != null)
                auxRoomsNotNull[i] = auxRooms[i];
        }

        allRooms = auxRoomsNotNull;
    }

    public void addEvent(EventH event) {
        EventH[] auxEvents = new EventH[allEvents.length + 1];

        for (int i = 0; i < allEvents.length; i++) {
            if (!allEvents[i].equals(event)) {
                return;
            } else
                auxEvents[i] = allEvents[i];
        }

        auxEvents[allEvents.length] = event;
        allEvents = auxEvents;
    }


    /**
     * setAllEvent va prelua camerele dintr-o lista si va adauga in allEvents doar camerele unice/neduplicate.
     * Initial se vor adauga si elemente null, cele care sunt duplicate, dar apoi se va aloca un nou array care sa stocheze doar elementele nenule.
     * @param room
     */
    public void addRoom(RoomH room) {
        RoomH[] auxRooms = new RoomH[allRooms.length + 1];

        for (int i = 0; i < allRooms.length; i++) {
            if (allRooms[i].equals(room)) {
                return;
            } else
                auxRooms[i] = allRooms[i];
        }

        auxRooms[allRooms.length] = room;
        allRooms = auxRooms;
    }

    @Override
    public String toString() {
        return "allEvents = " + Arrays.toString(allEvents) +
                "\nallRooms = " + Arrays.toString(allRooms) +
                '}';
    }
}
