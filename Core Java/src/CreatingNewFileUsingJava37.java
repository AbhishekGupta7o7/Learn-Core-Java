import java.io.File;
import java.io.IOException;

public class CreatingNewFileUsingJava37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		try {
		File myObj = new File("C:\\Program Files\\Eclipse Workspace\\Core Java\\src\\filename1.txt");
			if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
			
		} catch (IOException e) {
			System.out.println("Unable to create a file");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
