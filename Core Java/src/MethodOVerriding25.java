class Bank
{
	String color = "red";
	public int Interest(int a)
	{
		return a*5;
	} 
	
}


class sbi extends Bank
{
	String color = "yellow";
	public int Interest(int a)
	{
		return a*7;
	}
}

class hdfc  extends Bank
{
	String color = "green";
	public int Interest(int a)
	{
		return a*8;
	}
}


class icici  extends Bank
{
	String color = "grey";
	public int Interest(int a)
	{
		return a*9;
	}
}



public class MethodOVerriding25 {
	
	public static void main(String[] args) {
		
		Bank o2= new Bank();
		System.out.println(o2.Interest(1));
		
		icici o1= new icici();
		System.out.println(o1.Interest(1));
		
		sbi o3= new sbi();
		System.out.println(o3.Interest(1));
		
		hdfc o4= new hdfc();
		System.out.println(o4.Interest(1));
		
		Bank o5= new icici();
		System.out.println(o5.Interest(1)); 
		/*Refrence type is of Superclass
		 *  But as object is of child class so it gives 9
		 * It's working as superclass is also having same method name
		 */
		
		System.out.println(o2.color);
		System.out.println(o1.color);
		System.out.println(o3.color);
		System.out.println(o4.color);
		System.out.println(o5.color);   // Prints Red as there as nothing like variable overloading
		
		
		

	}

}
