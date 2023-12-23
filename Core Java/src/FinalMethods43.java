
class C
{
	void method1()
	{
		System.out.println("Prints 1");
	}
	
	final void method2()
	{
		System.out.println("Prints 1");
	}
}


class D extends C
{
	void method1()
	{
		System.out.println("Prints 2");
	}
	
	
	final void method2()   // Getting error as final methods can not be overridden. 
	{
		System.out.println("Prints 1");
	}
}


public class FinalMethods43 {
	
	 public static void main(String args[])
	 {
     D o1= new D();
     o1.method1();
     o1.method2();
     
     C o2= new D();
     o2.method1();   // Prints 2 as it's overRidden
     
     C o3= new C();
     o3.method1();
}
}
