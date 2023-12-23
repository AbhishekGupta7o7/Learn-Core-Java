

public class callingStaticMethodsOutsideMainBlock {


    private static int number;

    // Instance method
    public static void setNumber(int num) {
        number = num;
    }

    // Another instance method
    public static void displayNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // Create an object of the class
    	

        // Call instance methods from the main method
    	callingStaticMethodsOutsideMainBlock.setNumber(42);
    	callingStaticMethodsOutsideMainBlock.displayNumber();

        // Calling method that uses instance method Outside the main method and the MyClass
        callMethodsOutsideClass();
    }

    // Method outside the main and class
    public static void callMethodsOutsideClass() {
    	
    	callingStaticMethodsOutsideMainBlock.setNumber(77);
    	callingStaticMethodsOutsideMainBlock.displayNumber();
    }
}
