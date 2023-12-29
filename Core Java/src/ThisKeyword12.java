
public class ThisKeyword12 {
	
	public void a1() {
		System.out.println("Printing from a1 method");
	}
	
	public void a1(int i) {
		System.out.println("Printing from a1 method");
	}
	
	public void a2(int i) {
		System.out.println("Printing from a1 method");
	}
	
	
	public void a3()
	{
		
		this.a1();  // called current class method
		a1();
		this.a1(0);
		a1(0);
		
	}
	
	

	

	public static void main(String[] args) {
		
		
		ThisKeyword12 o1= new ThisKeyword12();
		o1.a3(); // called a2 method
		
		

	}

}
