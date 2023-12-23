
public class ArithmeticExceptions37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		int i=1;
		int j = 0,k;
	//	k=i/j; // This critical statement gives us exception so put in try block. 
		try {
		k= i/j;   
		}
		
		catch(ArithmeticException e){    // e is object reference of Exception class
			System.out.println("Can not divide any number by 0  "  + e);
		}
		
		System.out.println("Hey");
		
		
	}

}
