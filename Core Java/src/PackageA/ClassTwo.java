package PackageA;

public class ClassTwo {

	public static void main(String[] args) {
		// ClassTwo can access all the info available in ClassOne directly with objects
		//without importing
		// as both belong to the same package  
		ClassOne a= new ClassOne();  
		a.display();
		a.display1();   // By default access modifier is public, thats why we are able
		//to access this method anywhere in Package A
		
		
		//a.display2();
		/*
		 * /* Un-commenting this gives us error, as display2() method is private method
		 * So only accessible in the class where it is defined. 
		 */
		
		
		a.display3();
		
		
		
		//ClassOne b= new ClassTwo();
		
		// Uncommenting this gives us error. 
		
	}

}
