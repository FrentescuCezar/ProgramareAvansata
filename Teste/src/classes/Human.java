package classes;

import java.util.Objects;

public abstract class Human implements interfata{
    public String name = "Tata";
    private Integer age = 0;
    private String company = "Caca";
    public static int numberOfHumans = 0;

    public Human(String name, Integer age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
        numberOfHumans++;
    }

    public Human() {
        numberOfHumans++;
    }

    public abstract void whatAmI();

    @Override
    public boolean equals(Object humanObject) {
        if (this == humanObject) return true;
        if (humanObject == null || getClass() != humanObject.getClass()) return false;
        Human human = (Human) humanObject;
        return name.equals(human.name) && age.equals(human.age) && company.equals(human.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, company);
    }

}

