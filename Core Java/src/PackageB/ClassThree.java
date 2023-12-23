package PackageB;

import PackageA.ClassOne;  // User defined package. 

public class ClassThree {

	public static void main(String[] args) {
		
		
		// As ClassOne is defined in Package A, and ClassThree is defined in Package B
		// So to use info of classOne we need to import that package here with ClassName
		ClassOne a= new ClassOne();  
		a.display();
		/* Also we are able to use display method in Package B 
		 * as it's access modifier is defined as Public
		 * 
		 */
	
		
		
		//	a.display1(); 
		
		/* Un-commenting this gives us error as we did not mentioned 
		any access modifier for method display1 so it's default access modifier is
		Default which is accessible only in same package.
 */
		
		
		//a.display3();
		
		/* Un-commenting this gives us error, as display3 is protected method */
	}

}
