package hrapp;

/**
 *
 * @author gibran
 */

public class Department {
    int MAX = 10;
    private Employee[] departmentArray = new Employee[MAX];
    
    public void addEmployee(Employee[] employee) { 
        try{
        departmentArray = employee;
        }catch(IndexOutOfBoundsException e) {
            System.err.println("Array capacity exceeded!");
         }
    }

    /*Method that return an array with all employees*/
    public static Employee[] getAllEmployees(Employee[] arr) {
    return arr;
    }
    public static int countNonNullElements(Object[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

}
