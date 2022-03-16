public class Street implements Comparable<Street> {
    private String name;
    private Integer length;
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

    public void setFirstIntersection(Intersection firstIntersection) {
        this.firstIntersection = firstIntersection;
    }

    public Intersection getSecondIntersection() {
        return secondIntersection;
    }

    public void setSecondIntersection(Intersection secondIntersection) {
        this.secondIntersection = secondIntersection;
    }

    @Override
    public int compareTo(Street other) {
        return this.length.compareTo(other.length);
    }

    @Override
    public String toString() {
        return "Street has " + "the name '" + name + '\'' + ", and the length " + length  + "\n";
    }
}
