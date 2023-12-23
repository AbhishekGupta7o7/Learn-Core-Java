
public class ThisKeyword11 {

	/*
	 
	 int i;
	public ThisKeyword11(int j) {
		
		i=j;
		
	}

	public void get()
	{
		System.out.println("Value of i is " +i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThisKeyword11 o1= new ThisKeyword11(5);
		o1.get();
		
	}

*/
	
	// ABove code works fine and set value of instance variable as local variable name is j
    // and instance variable name is i	. Value of i gets printed as 5
	
	
/*
	 
	 int i;
	 
	public ThisKeyword11(int i) {
		
		i=i;   // both are local  variables,  local variable i = local variable i
		System.out.println("Value of i local variable is " +i);
	}

	public void get()
	{
		System.out.println("Value of i instance variable is " +i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThisKeyword11 o1= new ThisKeyword11(5);
		o1.get();
		
	}
	
 */
	
	// ABove code does not works fine and set value of instance variable as local variable name is i
    // and instance variable name is i	. Value of i gets printed as 0.
	// As names were same inside constructor so value gets assigned to local variable only
	// To solve this problem we will use this keyword
	
	
	 int i;
	 int j=3;
		public ThisKeyword11(int i) {
			
			this.i=i;     // this keyword refers to the current object
			System.out.println("Value of i local variable is " +i);
			
			int j=5;
			System.out.println("Printing value of local variable "+j);
			System.out.println("\nPrinting value of global instance variable "+this.j);
			//This refers to the current object and object scope lies in a class level.
		}

		public void get()
		{
			System.out.println("Value of i instance variable is " +i);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			ThisKeyword11 o1= new ThisKeyword11(5);
			o1.get();
			
			ThisKeyword11 o2= new ThisKeyword11(10);
			o2.get();
			
			o1.get();
			
			
		}
}
	
	

