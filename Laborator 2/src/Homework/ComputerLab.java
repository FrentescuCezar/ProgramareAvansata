package Homework;

/**
 * It's an extension for RoomH, it adds the String variable operatingSystem.
 */
public class ComputerLab extends RoomH{
    private String operatingSystem;

    public ComputerLab(String name, int capacity, String operatingSystem) {
        super(name, capacity);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}

