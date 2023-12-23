
public class MethodOverloading23 {

	
	public int multiply(int a, int b, int c)
		{ return a*b*c;	}
	
//	public float multiply(int a, int b, int c)  // Does not work in java
	
	public int multiply(int a, int b)
	{
		{ return a*b;	}
	}
	
	public double multiply(int a, double b)
	{
		{ return a*b;	}
	}
	
	
	
	
	
	public static void main(String[] args) {
		MethodOverloading23 o1= new MethodOverloading23();
		System.out.println(o1.multiply(5, 5));
		System.out.println(o1.multiply(5, 5,5));
		System.out.println(o1.multiply(5, 5.7));
	
           
	}

}
