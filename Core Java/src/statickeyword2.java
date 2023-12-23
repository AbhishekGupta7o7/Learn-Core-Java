
class Emp1 {
	int Eid; // Instance variable
	int salary;
	static String ceo = "abhi";
	public int k;
	// k=1000; // gives error in above line as it's an instance variable // we can
	// not define instance variable outside method
	public int b = 20;
	static int kk = 1000;

	static {
		ceo = "new";
		System.out.println("Static Block Only Loads once when class is loaded into the memory");
	}

	/*
	 * We should not define it's value in the constructor as constructor gets called
	 * again and again every time object gets created. So we should either define
	 * static variables value while declaring it or we can do it with the static
	 * block. Static block only executed once when class gets loaded into the
	 * memory. Thats why static variable CEO value gets changed to new.
	 */

	public void a() {
		int a = 10; // works
		// static int b=10; // does not works Local variable can not be static

		/*
		 * int c; c=1000;
		 */ // works as this was local variable. same does not work for instance variable.
	}

	int count = 0; // VERY CLEARLY OBSERVE COUNT VALUE
	// INSTANCE variable will get memory each time when the instance is created
	// so upon incrementing this inside constructor twise it's value stays 1.

	static int count1 = 0; // will get memory only once and retain its value
	// so upon incrementing this inside constructor twise it's value becomes 2.

	// Emp1 is Constructor
	public Emp1() {

		count1++; // increasing value of static variable inside constructor
		count++; // increasing value of instance variable inside constructor
		Eid = 1;
		salary = 20000;
		System.out.println("Count1 variable value i.e static variable value is  " + count1 + "  Count variable value is " + count + "  "
				+ " Constructor gets called every time we create an object, so two times here");
	}

	static {
		ceo = "new2";
		System.out.println(
				"Second Static Block Only Loads once when class is loaded into the memory but it gets loaded before constructor block");
	}

	public void show()

	{
		// System.out.println(Eid+ " "+ salary+ " "+ Emp1.ceo); // works Emp1.ceo
		System.out.println(Eid + " " + salary + " " + ceo + " " + b);
		// System.out.println(Eid+ " "+ salary+ " "+ suresh.ceo); suresh.ceo Does not
		// works
	}

}

public class statickeyword2 {

	int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a=10000; // we can not use non static variables inside static block i.e
		// inside main
		b = 10000; 

		Emp1 suresh = new Emp1();
		Emp1 mahesh = new Emp1();

		suresh.show();
		mahesh.show();

		// System.out.println(Emp1.ceo); works
		// System.out.println(ceo); // Does not works
		// System.out.println(suresh.ceo); // works with warning

	}
}
