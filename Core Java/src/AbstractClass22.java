
abstract class a1
{
	abstract int multiply(int a, int b, int c);
	abstract int multiply1(int a, int b, int c, int d);
	
	void show()
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
		
		a1 o1= new b1();
		System.out.println(o1.multiply(5, 5, 5));
		System.out.println(o1.multiply1(5, 5, 5, 5));
		
		o1.show();
		
		//O1 object can not access display method

	}

}
