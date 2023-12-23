import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoNewlyCreatedFileInJava38 {

	public static void main(String[] args) {
	
        try {
			FileWriter f = new FileWriter("C:\\Program Files\\Eclipse Workspace\\Core Java\\src\\filename1.txt");
			f.write("This is first time i am writing into the file.\nOk Bye");
			f.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			
			System.out.println("Unable to write into the file");
			e.printStackTrace();
			
		}
		
        
        
	}

}
