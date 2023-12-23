import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date d = new Date();
       System.out.println(d);  // Prints standard format given by date class
       System.out.println("\n"+d.toString()); 
       
       //How to print data in your needed format
       
       //https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/text/SimpleDateFormat.html
       
       SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
       System.out.println("\n"+sdf.format(d));
       
       SimpleDateFormat sdf1 = new SimpleDateFormat("h::m::s");
       System.out.println("\n"+sdf1.format(d));
       
       SimpleDateFormat sdf2 = new SimpleDateFormat("hh::mm::ss");
       System.out.println("\n"+sdf2.format(d));
       
	}

}
