import java.io.File;  // Import the File class

public class DeleteFile41 {
  public static void main(String[] args) { 
	File myObj = new File("C:\\Program Files\\Eclipse Workspace\\Core Java\\src\\filename1.txt");
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}