class a

{
	a()
	{
		System.out.println("Parent class constructor");
	}
}

public class OrderOfExecutionWithInstanceInitializerBlock30  extends a
{
	
	OrderOfExecutionWithInstanceInitializerBlock30()
	{
       super();
       System.out.println("Constructor of Child class");
	}


{System.out.println("Instance initializer block is invoked");}  



	public static void main(String[] args) {
		
		OrderOfExecutionWithInstanceInitializerBlock30 o1= new OrderOfExecutionWithInstanceInitializerBlock30();
				
		
	}


}