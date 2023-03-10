package hrapp;

/**
 *
 * @author gibran
 */
public class Department {

    //NAME
    private String departmentName;

    //CONSTRUCTOR
    public Department(String name) {
        departmentName = name;
    }

    //GETTER (name)
    public String getDepartmentName() {
        return departmentName;
    }

    //SETTER (name)
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /*Each Department has a capacity of 10 employees*/
    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    /*Method that adds a new Employee to the <employees> array.*/
    public void addEmployee(Employee anEmployee) {
        /*Lit is just one if statement lol
        Btw, we're not throwing an exception in case +10*/
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }

    public Employee[] getEmployees() {
        /*Return an array of E. that has the exact number of elements that
        matches the actual number of employees in this department.
        This can be calculated by adding one to the -lastAdd...- variable.
        Then copy references for relevant employee object from the employeers
        array to this new array and return it to the invoker.
        This way invoker always gets an array that is already trimed to exact
        required size.*/
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];
        //Copy the <employees> array to the <actualEmployees> one
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }
    
    public int getEmployeeCount(){
        return lastAddedEmployeeIndex + 1;
    }
    
    //Query method that attempts to locale an employee w a specific ID
    public Employee getEmployeeByID(int employeeID){
        for (Employee emp:employees){
            if (emp.getID() == employeeID){
                return emp;
            }
        }
        return null;//Mandatory to return this bc ?¿
        /*ok we return a null just in case we dont find the ID*/
    }
    //Total salary for all employees
    public double getTotalSalary(){
        return 0.0;
    }
    
    //Overriding toString()String
    @Override
    public String toString() {
        return getDepartmentName();
    }
}
