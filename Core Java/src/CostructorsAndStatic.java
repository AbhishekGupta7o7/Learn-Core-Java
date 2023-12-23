



public class CostructorsAndStatic {
    private int instanceVar;

    // Constructor (non-static)
    public CostructorsAndStatic(int value) {
        this.instanceVar = value;
    }

    
	private void instanceMethod() {
		// TODO Auto-generated method stub
		System.out.println(this.instanceVar);
		System.out.println(instanceVar);
	}
    // Static method
    public static void staticMethod() {
        // Cannot use "this" in a static method
        // System.out.println("Static Method - Instance Variable: " + this.instanceVar); // Error

        System.out.println("Static Method - Static content");
        
       // System.out.println(instanceVar); //error, as static methods can not access
        // non static directly. 
        
        //Static methods can access instance variables using objects
        CostructorsAndStatic exampleObject = new CostructorsAndStatic(10);
        System.out.println(exampleObject.instanceVar);
    }

    public static void main(String[] args) {
        // You can create an instance of the class and use the constructor
    	CostructorsAndStatic exampleObject = new CostructorsAndStatic(42);

        // Call the instance method on the created object
        exampleObject.instanceMethod();

        // Call the static method directly on the class
        CostructorsAndStatic.staticMethod();
    }


}
