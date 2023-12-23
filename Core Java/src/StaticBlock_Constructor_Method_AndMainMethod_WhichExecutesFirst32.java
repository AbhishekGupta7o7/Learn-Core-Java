
public class StaticBlock_Constructor_Method_AndMainMethod_WhichExecutesFirst32 {

	
	static String v;
	
	static void raman() {
		System.out.println("Static method gets called");
	}
	
	void display()
	{
		System.out.println("normal method");
	}
	
	//display();
	 
	StaticBlock_Constructor_Method_AndMainMethod_WhichExecutesFirst32()
	{
		System.out.println("Constructor gets called");
	}
	
	static {v="abhi";
	System.out.println(v+"  static block gets called");}
	
	public static void main(String[] args) {
		raman(); //gets called after static block
		System.out.println("main method gets called");
		StaticBlock_Constructor_Method_AndMainMethod_WhichExecutesFirst32 o1= new StaticBlock_Constructor_Method_AndMainMethod_WhichExecutesFirst32();
		o1.display();
		raman();

	}

}
