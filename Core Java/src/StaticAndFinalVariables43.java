


public class StaticAndFinalVariables43 {
    // Static variable shared among all instances of the class
    static int staticVariable = 10;
    static int staticVariable2;

    // Final variable cannot be reassigned after initialization
    final int finalVariable;

    // Constructor to initialize finalVariable
    public StaticAndFinalVariables43(int value) {
        this.finalVariable = value;
        this.staticVariable2=value;
    }
    
    
    
    
    

    public static void main(String[] args) {
        // Create two instances of StaticAndFinalVariables43
        StaticAndFinalVariables43 obj1 = new StaticAndFinalVariables43(5);
        StaticAndFinalVariables43 obj2 = new StaticAndFinalVariables43(8);

        // Access static variable through class name
        System.out.println("Static Variable: " + StaticAndFinalVariables43.staticVariable);
        System.out.println("Static Variable: " + obj1.staticVariable2);
        System.out.println("Static Variable: " + obj2.staticVariable2);

        // Access final variable through instances
        System.out.println("Final Variable in obj1: " + obj1.finalVariable);
        System.out.println("Final Variable in obj2: " + obj2.finalVariable);

        // Attempt to modify final variable (will result in a compilation error)
        // obj1.finalVariable = 15; // Uncommenting this line will result in an error

        // Modify static variable
        StaticAndFinalVariables43.staticVariable = 20;

        // Print updated static variable value for both instances
        System.out.println("Updated Static Variable in obj1: " + obj1.staticVariable);
        System.out.println("Updated Static Variable in obj2: " + obj2.staticVariable);
    }
}
