package Compulsory;

import java.util.Objects;

public class Room {
    private String name;
    private Type type;
    private int capacity;
    public static int numberOfRooms;

    public Room(String name, int capacity, Type type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        numberOfRooms++;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(cap=" + capacity + ", " + type + ")";
    }

    public static void addRooms(Room[] allRooms, Room... args){
        for(int i=0;i< args.length;i++){
            allRooms[i] = args[i];
        }
    }
}

