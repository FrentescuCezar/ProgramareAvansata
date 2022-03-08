package Homework;

public class LectureHall extends RoomH {
    private boolean hasVideoProjector;

    public LectureHall(String name, int capacity, boolean hasVideoProjector) {
        super(name, capacity);
        this.hasVideoProjector = hasVideoProjector;
    }
}


