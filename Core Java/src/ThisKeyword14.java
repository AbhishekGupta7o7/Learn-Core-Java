
public class ThisKeyword14 {
	
	
	public ThisKeyword14()
	{
		this(5); // calling parameterized constructor
        System.out.println("Default Constructor");
	}

	
	
	
	public ThisKeyword14(int i) {
		System.out.println(i);  // local  variables
	}

	
	
	
	// instance variables
	
	int i, k; 
	char c; 
	String string;
	
	
	
	
	
	public ThisKeyword14(int i, char c, String string) {
		
		this.i=i;
		this.c=c;
		this.string=string;
	}
	
	
	
	

	public ThisKeyword14(int j, char d, String string2, int k) {
		
		this(j,d,string2);  // Reusing constructor
		this.k=k;
	}

	
	
	
	void display(){System.out.println(i+" "+c+" "+string+" "+k);}  
	
	
	
	
	
	public static void main(String[] args) {
		
		ThisKeyword14 o1= new ThisKeyword14();
		
		ThisKeyword14 o2= new ThisKeyword14(5,'a',"abhi");
		ThisKeyword14 o3= new ThisKeyword14(5,'a',"abhi", 5);
		
		o2.display();
		o3.display();
	}

}
