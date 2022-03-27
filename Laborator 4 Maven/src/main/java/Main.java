import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        List<Street> streets = new LinkedList<>();

        List<Intersection> vertices = Arrays.asList(IntStream.range(0, 19)
                .mapToObj(i -> new Intersection(faker.address().streetSuffix())).toArray(Intersection[]::new));
        Set<Intersection> intersections = new HashSet<>(vertices);


        for (int i = 0; i < 6; i++) {
            Set<Intersection> auxIntersections = new HashSet<>();
            auxIntersections.add(vertices.get(i));
            auxIntersections.add(vertices.get(i+1));
            streets.add(new Street(faker.address().streetName(), 1, auxIntersections));
        }

        for (int i = 7; i < 15; i++) {
            Set<Intersection> auxIntersections = new HashSet<>();
            auxIntersections.add(vertices.get(i));
            auxIntersections.add(vertices.get(i+1));
            streets.add(new Street(faker.address().streetName(), 2, auxIntersections));
        }
//
//
        for (int i = 15; i < 18; i++) {
            Set<Intersection> auxIntersections = new HashSet<>();
            auxIntersections.add(vertices.get(i));
            auxIntersections.add(vertices.get(i+1));
            streets.add(new Street(faker.address().streetName(), 3, auxIntersections));
        }

        streets.sort(Comparator.comparing(street -> street.getLength()));
        // Or Method Reference streets.sort(Comparator.comparing(Street::getLength));

        intersections.addAll(vertices); // We see that the Set property doesn't duplicate the same vertices twice.
        /*OR THIS METHOD
        if (intersections.size() != vertices.size())
            System.out.println("Duplicates");
        */


        City city = new City(intersections, streets);

        System.out.println(city.query(1));
    }
}
