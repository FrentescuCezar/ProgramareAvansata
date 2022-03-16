package main; // package-urile sunt bune la modificatorii / specificatorii de acces, mai ales pentru protected

import classes.Employee;
import classes.Human;
import classes.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println(Student.numberOfStudents);

        Human adina = new Employee("Andreea");
        Human cezar = new Student("Cezar",34,"UAIC");



        System.out.println(adina.hashCode());
        System.out.println(cezar.hashCode());

        //adina.whatAmI();
        //cezar.whatAmI();
        Human[] allHumans = new Human[2];
        allHumans[0] = adina;
        allHumans[1] = cezar;
        for(Human employeeOrStudent : allHumans){
            employeeOrStudent.whatAmI();
            employeeOrStudent.whoAmI();
            employeeOrStudent.whoAreYou();
        }

        int test;
        test = Integer.parseInt("5");
        System.out.println(test);

    }
}
