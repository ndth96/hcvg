package excercises.lesson1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(){
 
    }

    public Employee(int Id, String FirstName, String LastName, int Salary){
        id = Id;
        firstName = FirstName;
        lastName =  LastName;
        salary = Salary;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int Salary){
        salary = Salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent) {
        return (int)(salary*((double)(100+percent)/100));  
    }

    public String toString(){
        return "Employee [id= "+id+",name="+firstName+" "+lastName+", salary= "+salary +"]";

    }
}