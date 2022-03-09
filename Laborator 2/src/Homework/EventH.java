package Homework;

import java.util.Objects;

public class EventH {
    private String name;
    private int size;
    private int start;
    private int end;

    public EventH(String name, int size, int start, int end) {
        this.name = name;
        this.start = start;
        this.size = size;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return name + "(size=" + size + ", start=" + start + ", end=" + end + ")";
    }

    @Override
    public boolean equals(Object event) {
        if (this == event) return true;
        if (event == null || getClass() != event.getClass()) return false;
        EventH eventH = (EventH) event;
        return size == eventH.size && start == eventH.start && end == eventH.end && name.equals(eventH.name);
    }
}
