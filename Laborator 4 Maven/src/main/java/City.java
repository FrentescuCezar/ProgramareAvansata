import java.util.*;
import java.util.stream.Collectors;


public class City {
    private final Set<Intersection> intersectionSet;
    private final List<Street> streetList;
    private final Map<Intersection, List<Street>> mapIntersectionToStreet = new HashMap<>();

    public City(Set<Intersection> intersectionSet, List<Street> streetList) {
        this.intersectionSet = intersectionSet;
        this.streetList = streetList;
        createCity();
    }


    private void createCity() {
        for (Intersection intersection : intersectionSet) {
            List<Street> streets = new ArrayList<>();
            for (Street street : streetList) {
                if (street.getIntersectionsList().contains(intersection) )
                    streets.add(street);
            }
            mapIntersectionToStreet.put(intersection, streets);
        }
    }

    public List<Street> query(int value) {
        Set<Intersection> auxIntersections = new HashSet<>();

        for (Street street1 : streetList) {
            for (Street street2 : streetList) {
                for (Street street3 : streetList) {
                    List<Street> auxStreets = new ArrayList<>();

                    //Making sure to add at least 3 streets
                    auxStreets.add(street1);
                    auxStreets.add(street2);
                    auxStreets.add(street3);

                    for (Map.Entry<Intersection, List<Street>> element : mapIntersectionToStreet.entrySet()) {
                        if (element.getValue().containsAll(auxStreets))
                            auxIntersections.add(element.getKey());
                    };
                }
            }
        }

        return streetList.stream()
                .filter(street -> street.getLength() > value)
                .distinct()
                .collect(Collectors.toList());
    }
}
