import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TryWithResouce2 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         
		// Java says if we are creating the finally block just
		// For closing the Resource then don't do it
		
		 
             
             
		
		//Instead of above remove finally block and create resource in try as an argument
		
		try(BufferedReader br2= new BufferedReader(new InputStreamReader(System.in))) {
			String s= br2.readLine();
			System.out.println("Second block");
		} catch (IOException e) {
			
			System.out.println(e);
		}
		
		
		
		
	}

}
