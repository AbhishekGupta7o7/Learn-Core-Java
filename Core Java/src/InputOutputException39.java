import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputException39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a=Integer.parseInt(sc.next());
		// int j = Integer.parseInt(br.readLine());
		try 
		{
		  System.out.println("Enter number");
		  int j = Integer.parseInt(br.readLine());
		}
		
		catch(IOException e)
		{
			System.out.println("IOException");
		}
   // Question is why scanner class does not givers error and BufferedReader does.
		
		finally
		{
			sc.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				e.printStackTrace();
			}
			
			finally
			{
				System.out.println("Hi");
			}
			
		}
		
	}

}
