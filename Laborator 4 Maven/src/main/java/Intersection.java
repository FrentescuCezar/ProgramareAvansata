public class Intersection {

    private String name;

    public Intersection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "Intersection has " + "the name '" + name + '\'' + "\n";
    }
}
