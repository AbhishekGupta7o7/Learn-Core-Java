


public class callingStaticMethodsOutsideMain {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Call static method from the main method
        staticMethod();

        // Call static method outside the main method
        anotherMethod();
    }

    // Another method outside the main method
    public static void anotherMethod() {
        System.out.println("Calling static method from another method. i.e Outside main blocl");
        staticMethod(); // Calling the static method from within another method
    }
}
