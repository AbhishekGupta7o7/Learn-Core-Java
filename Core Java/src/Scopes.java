 class Animal1
{
	 String color= "blue";
	public void eat()
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

 
class Dog1 extends Animal1
 
 {
	 
	 
	 public void eat()
		{
			System.out.println("ALL new Animals will eat");
		}
 
 }

public class Scopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a = new Dog1();
		a.eat();
		

	}

}
