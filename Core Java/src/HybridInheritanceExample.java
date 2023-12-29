   class SingleClass
{
	void display1()
	{
		System.out.println("Print 1");
	}
}
 
 interface first
 {
	 void display2();
 }
 
 interface second
 {
	 void display3();
 }
 
 class inherit1ClassAnd2interfaces extends SingleClass implements first, second{

		public void display2() {
			System.out.println("Implementation 1");
			
		}
	 
	public void display3() {
		System.out.println("Implementation 2");
		
	}
	 
 }

public class HybridInheritanceExample {

	public static void main(String[] args) {
		inherit1ClassAnd2interfaces o1= new inherit1ClassAnd2interfaces();
		o1.display1();
		o1.display2();
		o1.display3();

	}

}
