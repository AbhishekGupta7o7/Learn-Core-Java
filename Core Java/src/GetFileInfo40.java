import java.io.File;  // Import the File class

public class GetFileInfo40 { 
  public static void main(String[] args) {
    File myObj = new File("C:\\Program Files\\Eclipse Workspace\\Core Java\\src\\filename1.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}