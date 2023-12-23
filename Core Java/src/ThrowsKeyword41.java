import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsKeyword41 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		String s = br.readLine(); // below lines gives us exception
		// and we were lazy to handle that exception,
		/* So we just suppress that exception using throws keyword
		 * Suppressing does not mean exception will be handled by java.
		 *  If exception occurs we will get error.
		 */
		
		System.out.println("Entered input is " +s);
		
		
	}

}
