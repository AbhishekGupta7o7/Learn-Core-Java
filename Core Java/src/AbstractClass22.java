abstract class a1
{
	abstract int multiply(int a, int b, int c);
	abstract int multiply1(int a, int b, int c, int d);
	
	void show()   // abstract class can have non abstract methods as well. 
	{
		System.out.println("showing");
	}
}


class  b1 extends a1
{
	int multiply(int num1, int num2, int num3)
	{
		return num1*num2*num3;
	}

	int multiply1(int num4, int num5, int num6, int num7) {
		// TODO Auto-generated method stub
		return num4*num5*num6*num7;
	}
	
	void display()
	{   
		
		System.out.println("displaying");
		
	}
}

public class AbstractClass22 {

	public static void main(String[] args) {
		
		//a1 o3= new a1();   // we can not create objects for abstract class. 
		a1 o1= new b1();
		System.out.println("Object refrence type is class a1");
		System.out.println(o1.multiply(5, 5, 5));
		System.out.println(o1.multiply1(5, 5, 5, 5));
		
		o1.show();
		
		//O1 object can not access display method
		
		System.out.println();
		b1 o2= new b1();
		
		System.out.println("Object refrence type is class b1");
		o2.display();
		o2.show();
		System.out.println(o2.multiply(5, 5, 5));
		System.out.println(o2.multiply1(5, 5, 5, 5));

	}

}
