package PackageA;

public class ClassOne {

	public void display()
	{
		System.out.println("Displaying Public method display From Package A Using Class One");
	}
	
	void display1()
	{
		System.out.println("Displaying method display 1 From Package A Using Class One. We have not "
				+ "defined any access modifier with this method so access modifier of this method is Default");
	}
	
	private void display2()
	{
		System.out.println("Displaying private method display 2 From Package A Using Class One");
	}
	
	
	protected void display3()
	{
		System.out.println("Displaying protected method display 3 From Package A Using Class One");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne a= new ClassOne();
		a.display();
		a.display1();
		a.display2();
		a.display3();
		
		
	}

}
