
public class ThisKeyword13 {
	
	

	public ThisKeyword13() {
	

		System.out.println("Default Constructor");
		
	}
	
	public ThisKeyword13(int i) {
		this();
		System.out.println(i);
	//	this(); // Not works as
		//constructor call must be the first statement inside the constructor.
		
	}
	
	public ThisKeyword13(String i) {
		this();
		System.out.println(i);
	//	this(); // Not works as
		//constructor call must be the first statement inside the constructor.
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword13 o1 = new ThisKeyword13(5);
		ThisKeyword13 o2 = new ThisKeyword13("Abhsihek");


	}

}
