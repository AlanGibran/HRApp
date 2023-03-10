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

    
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());

        
    Employee[] employeeArray = {e1,e2,e3,e4,e5};

    
    
    
    /*int count = countNonNullElements(myArray); // get the number of non-null elements
    System.out.println(count);*/
        
    }
    
}
