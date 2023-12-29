
public class Overloading {
    // Two methods with the same name and the same number of parameters but different types
    void displayValue(int value) {
        System.out.println("Displaying integer value: " + value);
    }
    
    void displayValue(int value, int value1) {
        System.out.println("Displaying integer value: " + value + " Second integer value "+ value1);
    }

    void displayValue(double value) {
        System.out.println("Displaying double value: " + value);
    }
    
    void displayValue(String value) {
        System.out.println("Displaying double value: " + value);
    }
    
    int displayValue1(int value) {    
        return value;
    }
	
	 double displayValue1(double value) {
	        return value;
	    }

    public static void main(String[] args) {
    	Overloading example = new Overloading();

        // We can achieve method overloading when methods have same return types and same number of arguments
    	//but argument types are different. 
        example.displayValue("hello");  
        example.displayValue(10);  
        example.displayValue(10.1);  
        example.displayValue(10,11); 
        System.out.println(example.displayValue1(10));    // displayValue1 works as arguments have different types 
                                                           //not because of return types  Refer OverloadingError
        System.out.println(example.displayValue1(10.1));    
      //  example.displayValue(10,11.5); // will give me error. 
    }
}
