package hrapp;

/**
 *
 * @author gibran
 */
public class Employee {

    //name w getter and setter
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ID
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //Salary
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Constructor
    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    //Overriding toString()String
    @Override
    public String toString() {
        return getName() + ", " + getID() + ", " + getSalary();
    }

}
