import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Street> streets = new LinkedList<>();
        Set<Intersection> intersections = new HashSet<>();

        List<Intersection> vertices = Arrays.asList(IntStream.range(1, 10)
                .mapToObj(i -> new Intersection("intersection" + i)).toArray(Intersection[]::new));

        List<Intersection> vertices2 = Arrays.asList(IntStream.range(1, 10)
                .mapToObj(i -> new Intersection("intersection" + i)).toArray(Intersection[]::new));


        List<Street> nodes1 = Arrays.asList(IntStream.range(0, 6).mapToObj(i -> new Street("street" + i, 1))
                .toArray(Street[]::new));
        List<Street> nodes2 = Arrays.asList(IntStream.range(0, 7).mapToObj(i -> new Street("street" + i, 2))
                .toArray(Street[]::new));
        List<Street> nodes3 = Arrays.asList(IntStream.range(0, 3).mapToObj(i -> new Street("street" + i, 3))
                .toArray(Street[]::new));

        intersections.addAll(vertices);

        streets.addAll(nodes1);
        streets.addAll(nodes3);
        streets.addAll(nodes2);

        streets.sort(Comparator.comparing(street -> street.getLength()));
        // or method reference streets.sort(Comparator.comparing(Street::getLength));

        intersections.addAll(vertices); // We see that the Set property doesn't duplicate the same vertices twice.

        System.out.println(intersections);
        System.out.println(streets);

    }
}
