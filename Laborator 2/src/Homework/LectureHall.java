package Homework;

/**
 * It's an extension for RoomH, it adds the boolean variable hasVideoProjector.
 */
public class LectureHall extends RoomH {
    private boolean hasVideoProjector;

    public LectureHall(String name, int capacity, boolean hasVideoProjector) {
        super(name, capacity);
        this.hasVideoProjector = hasVideoProjector;
    }

    public boolean hasVideoProjector() {
        return hasVideoProjector;
    }
}


