import java.util.*;

public class Street implements Comparable<Street> {
    private String name;
    private Integer length;
    private Set<Intersection> intersectionsList;


    public Street(String name, int length, Set<Intersection> auxIntersections) {
        this.name = name;
        this.length = length;
        intersectionsList = auxIntersections;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Set<Intersection> getIntersectionsList() {
        return intersectionsList;
    }

    @Override
    public int compareTo(Street other) {
        return this.length.compareTo(other.length);
    }

    @Override
    public String toString() {
        return "Street has " + "the name '" + name + '\'' + ", with the length of " + length  + "\n"
                + "The Intersections are : " + intersectionsList + "\n";
    }
}
