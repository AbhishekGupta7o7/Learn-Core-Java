

final class A 
{
     int i;
}    
class B extends A   // Gives me an error as we can not Extend final class
{
    int j;

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(j + " " + i); 
	}
     
}    




public class FinalClass42 
{
    public static void main(String args[])
    {
    	final int var =5;
    	var =6;     // can not change value of var, as it's final 
        B obj = new B();
        obj.display();     
    }
}

