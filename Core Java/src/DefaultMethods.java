interface MyInterface {
    default void myDefaultMethod() {
        System.out.println("Default implementation");
    }
    
    default void mySecondDefaultMethod() {
    	System.out.println("Default implementation 2 This is not overriden anywhere. ");
    }

    // Abstract method (can still be declared in the same interface)
    void myAbstractMethod();
}


class MyClass implements MyInterface {
    @Override
    public void myAbstractMethod() {
        System.out.println("Concrete implementation of abstract method");
    }

    // Optional: Override the default method
    @Override
    public void myDefaultMethod() {
        System.out.println("Overriding default implementation. Custom implementation of default method");
    }
    
    
}



public class DefaultMethods {

	public static void main(String[] args) {
		MyClass o1= new MyClass();
		o1.myDefaultMethod();
		o1.mySecondDefaultMethod();
		o1.myAbstractMethod();
		
	}

}
