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
        System.out.println("WELCOME TO HR");
    
    Employee e1 = new Employee("Yef", 1, 17500);
    Employee e2 = new Employee("Krr", 2, 21000);
    Employee e3 = new Employee("maik", 3, 0.0); 
    
        System.out.println(e1.toString());
    
    /*int count = countNonNullElements(myArray); // get the number of non-null elements
    System.out.println(count);*/
        
    }
    
}
