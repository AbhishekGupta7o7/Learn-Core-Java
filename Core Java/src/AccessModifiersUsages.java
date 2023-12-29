/*private class A
{
	// A top level class can not be private
}
*/

  /*default class A
{
	// We do not use default as a variable explicitly, compiler gives default access by itself.
}
*/

  /*protected class A
{
	// A top level class can not be protected
}
*/

  final class finalClass
  {
	void display1()
	{
		System.out.println("Display 1");
	}
  }
  
  abstract class abstractClass1
  {
	  abstract void display2();
	  
	  void display3()
	  {
		  System.out.println("Display 3");
	  }
  }
  
  class defaultClass     // we did not used any access modifier, it's access is by default package private
  {
	  void display4()
	  {
		  System.out.println("Display 4");
	  }
  }
  
  class extend extends abstractClass1
  {

	@Override
	void display2() {
		System.out.println("display 2");
		
	}
	
	public void publicMethod() {
        System.out.println("Public method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }
    
    void UsingToCallprivateMethod() {
        System.out.println("Used to call private method");
        privateMethod();
    }
    
    
	  
  }
  
  

public class AccessModifiersUsages {

	public static void main(String[] args) {
		extend o1= new extend();
		// o1.privateMethod();    // we can only use private methods inside that class only 
		// so to use it, shift main method inside  class named extend
		o1.UsingToCallprivateMethod();

	}

}
