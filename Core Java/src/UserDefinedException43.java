import java.util.Scanner;

public class UserDefinedException43 {


		@SuppressWarnings("resource")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int a= sc.nextInt();
			int b= sc.nextInt();
			try
			{
			if(a<b)
			{
				throw new Exception();  // we are throwing object of the exception
				// throw new ArithmeticException();
			}
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("First value can't be less then second value");
			}
			sc.close();
		}
	          
	         
	}

