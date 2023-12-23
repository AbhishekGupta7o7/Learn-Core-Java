
public class InitializingInstanceVariablesInDifferentWays10 {
	
	int j= 10;  // initializing at the time of declaration
	int b;
	// b=20;  // gives error in above line as we can not define values to instance variables outside main
	int i;
	int k;
	int ak;
	String s;
	double d;
	char c;
	int z;
	
	
	public void set(int valueToK)
	{
		k= valueToK;
		z=20;
	}
	
	public void set1(int ak)
	{
		this.ak= ak;   // if argument name is same as instance variable name then we use this  with instance variables
	}
	
	public InitializingInstanceVariablesInDifferentWays10(String string, double e, char f)
	{    // In constructor arguments are having different names than that of instance variables. If they are having same name
	   // we need to use this keyword which we will learn. 
		s=string;
		d=e; 
		c=f;
	}
	
	
	
	public void get()
	{
		System.out.println("Value of instance variables s, d, c is set by parameterized constructor");
		System.out.println("Value of instance variable s = " +s );
		System.out.println("Value of instance variable d = " +d );
		System.out.println("Value of instance variable c = " +c );
		
		System.out.println("Value of instance variables i is set by object and dot");
		System.out.println("Value of instance variable i = " +i );
		
		System.out.println("Value of instance variables j is set at the time of declaration");
		System.out.println("Value of instance variable i = " +j );
		
		System.out.println("Value of instance variables k is set using method");
		System.out.println("Value of instance variable k = " +k );
		
		
		System.out.println("Accessing Value of instance variables z is set under method");
		System.out.println("Value of instance variable z = " +z );
		
		System.out.println("Value of instance variables ak is set using method and to resolve"
				+ "ambiguity between instance variables and argument/local variable we use this keyword");
		System.out.println("Value of instance variable k = " +ak );
			
	}
	
	
	// get(); // we can not call instance method outside main.
	// o1.get();// we can not call instance method outside main.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InitializingInstanceVariablesInDifferentWays10 o1= 
				new InitializingInstanceVariablesInDifferentWays10("abhi", 5.5, 'a');  // Using Constructor call
		
		o1.i=5;   // initializing instance variable using object and dot
		
		o1.set(5); // initializing instance variable using object and dot and method
		
		o1.set1(50); // initializing instance variable using object and dot and method and 
		// using this keyword
		
		o1.get();  // Printing all Values
		

	}

}
