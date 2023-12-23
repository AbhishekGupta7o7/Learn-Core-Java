
abstract  class AbstractClass {   // abstract class having abstract method
	
	void engineGuidelines()
	{
		System.out.println("Engine guidelines");
	}
	
	abstract void display();
	
}



public  class AbstractMethod21 extends AbstractClass
{
	
	void display()
	{
		System.out.println("Displaying");
	}
	
	void display2()
	{
		System.out.println("You are accessing sub class method");
	}
	

	public static void main(String[] args) {
		
		AbstractMethod21 o1= new AbstractMethod21();
	
		
		// Notice color of both display methods
		
		
		o1.display();  // calling subclass method display as o1 is Class AbstractMethod21 type object.
		o1.display2(); // calling subclass method display as o1 is Class AbstractMethod21 type object.
		o1.engineGuidelines();   // because of inheritance we have access
		
		AbstractClass o2= new AbstractMethod21();
		o2.display();  
		// calling abstract class or super class method display as o2 is Class AbstractClass type object
		// o2.display2(); // display2 method Not available as  o2 is Class AbstractClass type object
		o2.engineGuidelines();
		
		
	
		
		
		
	}

}
