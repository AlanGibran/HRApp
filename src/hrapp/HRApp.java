package hrapp;

/**
 *
 * @author gibran
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HR App Starts");

        Employee e1 = new Employee("Yef", 1, 17500);
        Employee e2 = new Employee("Krr", 2, 21000);
        Employee e3 = new Employee("maik", 3, 0.0);
        Employee e4 = new Employee("Shirguis", 4, 0);
        Employee e5 = new Employee("Loletita", 5, 10);

        Employee[] employeeArray = {e1, e2, e3, e4, e5};

        Department dept = new Department("Education");

        dept.addEmployee(e1);
        dept.addEmployee(e2);

        dept.addEmployee(new Employee("Ao", 17, 17.0));

        Employee[] emps = dept.getEmployees();

        //The difference between these outputs
        System.out.println("Emp" + e1);
        System.out.println(e1.toString());

        for (Employee emp : emps) {
            System.out.println("Emp_For " + emp);
        }
        System.out.println("Total " + dept.getTotalSalary());
        System.out.println("Average Salary = " + dept.getAverageSalary());
        System.out.println("By ID " + dept.getEmployeeByID(16));
        /*int count = countNonNullElements(myArray); // get the number of non-null elements
    System.out.println(count);*/
    }

}
