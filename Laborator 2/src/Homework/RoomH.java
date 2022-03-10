package Homework;

import java.util.Objects;

/**
 *  Represents an room which is going to be assigned to an Event.
 */
public abstract class RoomH {
    private String name;
    private int capacity;
    private boolean isOccupied;

    public RoomH(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(cap=" + capacity + ", " + getClass().getName() + ")" ;
    }

    @Override
    public boolean equals(Object room) {
        if (this == room) return true;
        if (room == null || getClass() != room.getClass()) return false;
        RoomH roomH = (RoomH) room;
        return capacity == roomH.capacity && Objects.equals(name, roomH.name);
    }
}

