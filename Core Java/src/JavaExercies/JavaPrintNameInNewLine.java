package JavaExercies;

import java.util.Scanner;

public class JavaPrintNameInNewLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("This is the first line.\nThis is the second line.");
		System.out.println("Hello \nAlexandra Abramov!");
		   System.out.println("Hello \n Alexandra Abramov");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your full name");
            String s=sc.nextLine();   // reads the entire line including spaces
            System.out.println("Hello");
            System.out.println(s);
            
            System.out.println("Enter your first name");
            String s1= sc.next();      // Reads next token (a sequence of characters
            //until the next whitespace)
            System.out.println(s1);
           
            
            sc.close();
	}

}
