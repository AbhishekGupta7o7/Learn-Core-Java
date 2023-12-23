

public class ThisAndSuperUsageWithRespectToStaticAndInstanceMethods {
    private static int staticVar = 10;
    private int instanceVar = 20;

    public static void staticMethod() {
        // Cannot use "this" in a static method
        // System.out.println("Static Method - Instance Variable: " + this.instanceVar); // Error

        // Cannot use "super" in a static method
        // System.out.println("Static Method - Superclass Variable: " + super.instanceVar); // Error

        System.out.println("Static Method - Static Variable: " + staticVar);
    }

    public void instanceMethod() {
        // "this" is valid in an instance method
        System.out.println("Instance Method - Instance Variable: " + this.instanceVar);

        // "super" is valid in an instance method
        System.out.println("Instance Method - Superclass Variable: " + super.toString());
    }

    public static void main(String[] args) {
        // Call static method directly
        staticMethod();

        // To call instance method, create an instance of the class
        ThisAndSuperUsageWithRespectToStaticAndInstanceMethods exampleObject = new ThisAndSuperUsageWithRespectToStaticAndInstanceMethods();
        exampleObject.instanceMethod();
    }
}
