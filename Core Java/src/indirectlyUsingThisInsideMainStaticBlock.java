public class indirectlyUsingThisInsideMainStaticBlock {
    private int instanceVar;

    // Constructor
    public indirectlyUsingThisInsideMainStaticBlock(int value) {
        this.instanceVar = value;
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Inside instance method");
        System.out.println("Value of instanceVar: " + this.instanceVar);
    }

    public static void main(String[] args) {
        // Create an instance of the class
    	indirectlyUsingThisInsideMainStaticBlock exampleObject = 
    			new indirectlyUsingThisInsideMainStaticBlock(42);

        // Call the instance method on the created object
        exampleObject.instanceMethod();
    }
}
