import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouce4 {
	
	// WHY this gives me exception?

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Java says if we are creating the finally block just
		// For closing the Resource then don't do it

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br1.readLine(); // Critical line that gives us exception
			System.out.println("Least optimal block");
		} catch (IOException e) {

			System.out.println(e);
		}

		finally {
			br1.close();
		}

		// Instead of above remove finally block and create resource in try as an
		// argument

		try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
			String s = br2.readLine();
			System.out.println("Second block");
		} catch (IOException e) {

			System.out.println(e);
		}

		// Here catch block is also option, we can remove it, Java handles exception
		// in this case by itself. Below code works perfectly.

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String s = br.readLine();
			System.out.println("Optimal block");
		}

	}

}
