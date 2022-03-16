public class Street {
    private String name;
    private int length;
    private Intersection firstIntersection;
    private Intersection secondIntersection;

    public Street(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Intersection getFirstIntersection() {
        return firstIntersection;
    }

    public Intersection getSecondIntersection() {
        return secondIntersection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFirstIntersection(Intersection firstIntersection) {
        this.firstIntersection = firstIntersection;
    }

    public void setSecondIntersection(Intersection secondIntersection) {
        this.secondIntersection = secondIntersection;
    }
}
