package excercises.lesson1;


public class TestEmployee{

    public static void main(String[] args) {
        Employee e1 = new Employee(11, "Nguyen", "Thai", 1000);

        System.out.println(e1.toString());
        System.out.println("AnuSalary: "+e1.getAnnualSalary());
        System.out.println("RaiseSalary "+e1.raiseSalary(51));

        System.out.println("Name: " + e1.getName());
        System.out.println("Last Name: "+ e1.getLastName());
        System.out.println("First Name: "+ e1.getFirstName());
    }
}