// Practical usage is if same variables and methods are defined in parent and child, and we want to use
// methods and variables of parent inside child we can do that using super keyword.  
//For example we used color variable and getData method.

//We can also use parent class constructors inside child class constructor.


 class color
{
	 color()
		{
			System.out.println("Constructor of class Color(Parent constructor) is called");
		}
	String color="red";
	
	void getData()
	{
		System.out.println("\nEating in super class or parent class");
	}
	
	
}

 class dog25 extends color   // child class dog // super class color
{
	 String color="green";
	
	void getData()
	{
		
		
		System.out.println("\n"+super.color);   // calling instance variable of super class color using super 
		super.getData();   // calling instance method of super class color using super 
		System.out.println("\nEating in Child");
	}
	
	dog25(){
	//	System.out.println("Child class constructor");   // Does not work, as Constructor call must be the first statement in the constructor
	super();    // calling parent constructor using super
	System.out.println("\nChild class constructor");  
	
	}
}


 class SuperKeyword28 {

	public static void main(String[] args) {
		
		dog25 d= new dog25();       // Inside child class constructor(dog25) we called parent class constructor named "color"
		
		System.out.println("\nPrinting from main block "+d.color); // Printing child class variable value
	//	System.out.println(super.color); // does not work here
		
		d.getData();

	}

}  
  
 
 

/*
class Animal1{  
String color="white";  
}  
class Dog11 extends Animal1{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class SuperKeyword{  
public static void main(String args[]){  
Dog11 d=new Dog11();  
d.printColor();  
}}   */