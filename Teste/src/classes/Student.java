package classes;

public class Student extends Human{
    public static int numberOfStudents = 0;

    public Student(String name, Integer age, String company) {
        super(name, age, company);
        numberOfStudents++;
    }

    public void whatAmI(){
        System.out.println("I am a Student");
    }


    @Override
    public void whoAreYou() {

    }
}
