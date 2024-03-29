import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadingFileInJava39 {
  public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Program Files\\Eclipse Workspace\\Core Java\\src\\filename1.txt");
      Scanner sc = new Scanner(myObj);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}