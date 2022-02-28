public class Room {
    String name;
    Type type;
    int capacity;


    Room(String name, int capacity, Type type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
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
}

enum Type {
    COMPUTERLAB, LECTUREHALL;
}