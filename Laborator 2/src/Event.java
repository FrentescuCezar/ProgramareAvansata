public class Event {
    private String name;
    private int size;
    private int start;
    private int end;

    Event(String name, int size, int start, int end) {
        this.name = name;
        this.size = size;
        this.end = end;
    }

    public String getName() {
        return name; }

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
}
