package Homework;

import java.util.Arrays;


/**
 * Contains all the events and classes without duplicates.
 **/
public class Problem {
    EventH[] allEvents;
    RoomH[] allRooms;


    /**
     * It takes events from a list and it will add to "allEvents" only the events that are unique/not duplicate.
     * Initially it will also add null values for the events that are duplicates,
     * but then a new array is created that contains only unique elements.
     * @param events List of events
     */
    public void setAllEvents(EventH... events) {
        EventH[] auxEvents = new EventH[events.length];

        int index = 0;
        for (int i = 0; i < events.length; i++) {
            boolean duplicateEventFound = false;
            //Loop to make comparision between events and skip duplicate events
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

        //Counting how many elements contains null values.
        int counterNotNullElements = 0;
        for (EventH event : auxEvents) {
            if (event != null)
                counterNotNullElements++;
        }

        //Creating a new array that contains all the events without duplicates.
        EventH[] auxEventsNotNull = new EventH[counterNotNullElements];
        for (int i = 0; i < auxEvents.length; i++) {
            if (auxEvents[i] != null)
                auxEventsNotNull[i] = auxEvents[i];
        }

        allEvents = auxEventsNotNull;
    }

    /**
     * It takes rooms from a list and it will add to "allRooms" only the events that are unique/not duplicate.
     * Initially it will also add null values for the events that are duplicates,
     * but then a new array is created that contains only unique elements.
     * @param rooms List of rooms
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

        //Counting how many elements contains null values.
        int counterNotNullElements = 0;
        for (RoomH room : auxRooms) {
            if (room != null)
                counterNotNullElements++;
        }

        //Creating a new array that contains all the events without duplicates.
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
     * It adds a new room to the allRooms array, only if the room was not added previously.
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
