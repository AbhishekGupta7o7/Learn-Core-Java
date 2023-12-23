
public class FinallyBlockInJava40 {

	public static void main(String[] args) {
		
		int a=1;
		int b=0;
		int c;
		try
		{
			c=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception");
		}
          
		finally
		{
			System.out.println("Finally block will always execute");
		
		}
	}

}
