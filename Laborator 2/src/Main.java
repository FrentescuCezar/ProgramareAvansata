import Compulsory.*;
import Homework.*;


public class Main {
    public static void main(String[] args) {
        Main compulsory = new Main();
        //compulsory.compulsory();

        compulsory.homework();
    }

    void compulsory() {
        Event c1 = new Event("C1", 100, 8, 10);
        Event c2 = new Event("C2", 100, 10, 12);
        Event l1 = new Event("L1", 30, 8, 10);
        Event l2 = new Event("L2", 30, 8, 10);
        Event l3 = new Event("L3", 30, 10, 12);

        Event[] allEvents = new Event[Event.numberOfEvents];
        Event.addEvents(allEvents, c1, c2, l1, l2, l3);
        for (Event event : allEvents) {
            System.out.println(event);
        }

        Room r401 = new Room("401", 30, Type.COMPUTERLAB);
        Room r403 = new Room("403", 30, Type.COMPUTERLAB);
        Room r405 = new Room("405", 30, Type.COMPUTERLAB);
        Room r309 = new Room("309", 100, Type.LECTUREHALL);

        Room[] allRooms = new Room[Room.numberOfRooms];
        Room.addRooms(allRooms, r401, r403, r405, r309);
        for (Room room : allRooms) {
            System.out.println(room);
        }
    }
    void homework(){
        EventH c1 = new EventH("C1", 100, 8, 10);
        EventH c2 = new EventH("C2", 100, 10, 12);
        EventH l1 = new EventH("L1", 30, 8, 10);
        EventH l2 = new EventH("L2", 30, 8, 10);
        EventH l3 = new EventH("L3", 30, 10, 12);

        RoomH r401 = new ComputerLab("401", 30,"Windows");
        RoomH r403 = new ComputerLab("403", 30,"Windows");
        RoomH r405 = new ComputerLab("405", 30,"Linux");
        RoomH r309 = new LectureHall("309", 100,true);

        Problem problem = new Problem();

        problem.setAllEvents(c1,c2,l1,l2,l3,l3,l3);
        problem.setAllRooms(r401,r403,r405,r309);
        System.out.println(problem);

        EventH l4 = new EventH("L3", 30, 10, 12);
        problem.addEvent(l4);
        RoomH r304 = new LectureHall("304", 100,true);
        problem.addRoom(r304);

        System.out.println("\n" + problem);
    }
}
