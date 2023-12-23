
public class CallingInstanceMethodOutsideMainBlock {


    private int number;

    // Instance method
    public void setNumber(int num) {
        number = num;
    }

    // Another instance method
    public void displayNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // Create an object of the class
    	CallingInstanceMethodOutsideMainBlock myObject = new CallingInstanceMethodOutsideMainBlock();

        // Call instance methods from the main method
        myObject.setNumber(42);
        myObject.displayNumber();

        // Calling method that uses instance method Outside the main method and the MyClass
        callMethodsOutsideClass();
    }

    // Method outside the main and class
    public static void callMethodsOutsideClass() {
    	CallingInstanceMethodOutsideMainBlock externalObject = new CallingInstanceMethodOutsideMainBlock();
        externalObject.setNumber(77);
        externalObject.displayNumber();
    }
}
