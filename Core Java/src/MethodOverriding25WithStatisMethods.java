
class Bank1
{
	String color = "red";
	public static int Interest(int a)
	{
		return a*5;
	} 
	
}


class sbi1 extends Bank1
{
	String color = "yellow";
	public static int Interest(int a)
	{
		return a*7;
	}
}

class hdfc1  extends Bank1
{
	String color = "green";
	public static int Interest(int a)
	{
		return a*8;
	}
}


class icici1  extends Bank1
{
	String color = "grey";
	public static int Interest(int a)
	{
		return a*9;
	}
}




public class MethodOverriding25WithStatisMethods {


	public static void main(String[] args) {
		
		Bank1 o2= new Bank1();
		System.out.println(o2.Interest(1));
		
		icici1 o1= new icici1();
		System.out.println(o1.Interest(1));
		
		sbi1 o3= new sbi1();
		System.out.println(o3.Interest(1));
		
		hdfc1 o4= new hdfc1();
		System.out.println(o4.Interest(1));
		
		Bank1 o5= new icici1();
		System.out.println(o5.Interest(1)); 
		/*Reference type is of Superclass
		 *  And object is also of child class but it gives 5
		 * Superclass is also having same method name, but it did not over ride the method as 
		 * static method cannot be overridden. because the static method is bound with class whereas the 
		 * instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

		 */
		
		System.out.println(o2.color);
		System.out.println(o1.color);
		System.out.println(o3.color);
		System.out.println(o4.color);
		System.out.println(o5.color);   // Prints Red as there as nothing like variable overloading
		
		
		

	}

}
