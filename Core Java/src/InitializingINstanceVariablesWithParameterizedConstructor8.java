
public class InitializingINstanceVariablesWithParameterizedConstructor8 {

	int i;
	String s;
	float f;
	double d;
	char c;
	
	public InitializingINstanceVariablesWithParameterizedConstructor8
	(int jjjjjjjjjj, String st, float e, double g,
			char h) {
		
		i=jjjjjjjjjj;    // In constructor arguments are having different names than that of instance variables. If they are having same name
		s=st;   // we need to use this keyword which we will learn. 
		f=e;
		d=g;
		c=h;
	}

	public void show()
	{
		System.out.println("Instance variables gets values with the help of parameterized "
				+ "constructors");
		
		System.out.println("value of i is " + i);
		System.out.println("value of S " + s);
		System.out.println("value of f is " + f);
		System.out.println("Value of d is " + d);
		System.out.println("value of c is " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InitializingINstanceVariablesWithParameterizedConstructor8 
		o1= new InitializingINstanceVariablesWithParameterizedConstructor8(10, "abhi", 5, 8.0, 'a');
		
		o1.show();

	}

}
