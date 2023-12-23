

 class Animal
{
	 String color= "blue";
	public static void eat()
	{
		System.out.println("ALL Animals will eat");
	}
	
	void commonMethodInParentAndChild()    // Non static   so gets over ridden
	{
		System.out.println("one");
	}
	
	void nonCommonMethods()
	{
		System.out.println("Yellow");
	}
	
}

 class Dog extends Animal
 
 {
	 
	 
	 public static void eat()
		{
			System.out.println("ALL new Animals will eat");
		}
	 
	 
	 public static void bark()
		{
			System.out.println("Only Dog Barks");
		}
	 
	 
	 
	 void accessVariablesOfParentClass()
	 {
		 System.out.println("Animals favourite color is "+ color+". "+ " This comes from parent class. ");
	 }
	 
	 

	 
	 
		 void commonMethodInParentAndChild()   // Non static
		{
			System.out.println("two");
		}
		
 }


/*
 
 class Cat extends Animal, Dog
 {
	 
 }
 
 multiple inheritance not allowed as if Animal and Dog have same method and Child class calls that,
 Java is confused which one to return. Can be achieved using interfaces where implementation is in sub classes. 
 Refer MultipleInheritanceInJavaViaInterface36
 */
 
 
 class Cat extends Dog
 
 {
	 void commonMethodInParentAndChild()    // Non static   so gets over ridden
		{
			System.out.println("three");
		}
 }
 


public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.bark();
		d.eat();
		d.accessVariablesOfParentClass();
		Animal a= new Dog();
		a.eat();
	//	a.bark();   gives error. 
		
		
		d.commonMethodInParentAndChild();
		a.commonMethodInParentAndChild();    // Even with Animal type object output of child class gets printed. 

		Cat c= new Cat();
		c.commonMethodInParentAndChild();  // method overriding
		d.commonMethodInParentAndChild();
		a.commonMethodInParentAndChild(); 
	}
	
	
	
	
	

}
