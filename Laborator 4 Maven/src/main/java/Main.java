import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Street> streets = new LinkedList<>();
        Set<Intersection> intersections = new HashSet<>();

        Intersection[] nodes = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new Intersection("intersection" + i)).toArray(Intersection[]::new);

        List<Street> streetCosts1 = Arrays.asList(IntStream.range(0, 6)
                .mapToObj(i -> new Street("street" + i, 1))
                .toArray(Street[]::new));
        List<Street> streetCosts2 = Arrays.asList(IntStream.range(0, 7)
                .mapToObj(i -> new Street("street" + i, 2))
                .toArray(Street[]::new));
        List<Street> streetCosts3 = Arrays.asList(IntStream.range(0,3)
                .mapToObj(i -> new Street("street" + i, 3))
                .toArray(Street[]::new));

        intersections.addAll(Arrays.stream(nodes).toList());
        streets.addAll(streetCosts1);
        streets.addAll(streetCosts2);
        streets.addAll(streetCosts3);

        



    }


}
