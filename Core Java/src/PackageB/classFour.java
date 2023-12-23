package PackageB;

import PackageA.ClassOne;

public class classFour extends ClassOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClassOne a= new ClassOne();  
		a.display3();   //Gives us error as display3 is protected
		and can be accessible with object of child class after importing. 
		*/
		
		classFour a1= new classFour();
		a1.display3();
	}

}
