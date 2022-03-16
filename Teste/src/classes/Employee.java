package classes;

public class Employee extends Human{
    private String prenume;

    public Employee(String name, Integer age, String company) {
        super(name, age, company);
        super.name = name;
    }

    public Employee(String prenume){
        super();
        this.prenume = prenume;
    }

    public void whatAmI(){
        System.out.println("I am an Employee");
    }


    @Override
    public void whoAreYou() {

    }
}
