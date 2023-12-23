
public class DefaultConstructor7 {

	
	int i;
	String s;
	float f;
	double d;
	char c;
	
	
	DefaultConstructor7()     // We need to create this empty constructor because we created parameterized constructor.
	// we can comment both and use only show to see the default constructor in action in the background. 
	{

	}
	
	DefaultConstructor7(int i, String s, float f, double d, char c)
	{
		this.i=i;
		this.s=s;
		this.f=f;
		this.d=d;
		this.c=c;
	}
	
	
	public void show()
	{
		System.out.println("Default constructor is used by java to"
				+ " provide the default values to the object like 0, "
				+ "null, etc., depending on the type.java");
		
		System.out.println("Default value of integer is " + i);
		System.out.println("Default value of String is " + s);
		System.out.println("Default value of float is " + f);
		System.out.println("Default value of double is " + d);
		System.out.println("Default value of char is " + c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor7 o1= new DefaultConstructor7();
		o1.show();
		DefaultConstructor7 o2= new DefaultConstructor7(5,"abhi",(float)12.12345 ,5.5,'a');
		o2.show();

	}

}
