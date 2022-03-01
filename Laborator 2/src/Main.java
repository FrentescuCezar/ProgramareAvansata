import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Event c1 = new Event("C1", 100, 8, 10);
        Event c2 = new Event("C2", 100, 10, 12);
        Event l1 = new Event("L1", 30, 8, 10);
        Event l2 = new Event("L2", 30, 8, 10);
        Event l3 = new Event("L3", 30, 10, 12);

        ArrayList<Event> allEvents = new ArrayList<>();
        allEvents.add(c1);
        allEvents.add(c2);
        allEvents.add(l1);
        allEvents.add(l2);
        allEvents.add(l3);
        for (Event event : allEvents) {
            System.out.println(event);
        }

        Room r401 = new Room("401", 30, Room.Type.COMPUTERLAB);
        Room r403 = new Room("403", 30, Room.Type.COMPUTERLAB);
        Room r405 = new Room("405", 30, Room.Type.COMPUTERLAB);
        Room r309 = new Room("309", 100, Room.Type.LECTUREHALL);

        ArrayList<Room> allRooms = new ArrayList<>();
        allRooms.add(r401);
        allRooms.add(r403);
        allRooms.add(r405);
        allRooms.add(r309);
        for (Room room : allRooms) {
            System.out.println(room);
        }

    }
}
