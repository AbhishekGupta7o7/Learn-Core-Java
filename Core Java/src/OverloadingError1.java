
public class OverloadingError1 {
	
	
	

	void displayValue(double d) {
        System.out.println("Displaying double value: " + d);
    }
	
	void displayvalue1(int i)
	{
		 System.out.println("Displaying int value: " + i);
	}
	
	void sum(int a,double b){System.out.println("a method invoked");}  
	void sum(double a,int b){System.out.println("b method invoked");}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingError1 example = new OverloadingError1();
		example.displayValue(10);   // Worked as double method called, it's not a loosy conversion
		example.displayValue1(10.1); // Error because double value can not be converted into int.
		example.sum(20,20); // Error because double value can not be converted into int.
		example.sum(10, 10.5); // worked as a method invoked
		example.sum(10.5, 10); // worked as b method invoked. 
		
		
	}

}
