import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TryWithResouce3 {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         
		// Java says if we are creating the finally block just
		// For closing the Resource then don't do it
		
		
		
		// Here catch block is also option, we can remove it, Java handles exception 
		// in this case by itself. Below code works perfectly. 
		
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
			String s= br.readLine();
			System.out.println("Optimal block");
		} 
		
	}

}
