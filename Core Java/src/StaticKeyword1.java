

class Emp
{
	int eId;
	int salary;
	String name;
	static String CEO = "Musk" ;
	
	
	
	public  void show()
	
	{
		System.out.println(eId+ " "+ salary+ "  "+ name+ " "+ CEO);
	}
}


public class StaticKeyword1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp abhishek= new Emp();
		abhishek.eId=1;
		abhishek.salary=1000000000;
		abhishek.name="Abhishek Gupta";
		abhishek.show();
		Emp.CEO="Abhi";  // Accessing static variable with help of Class name
		
		
		abhishek.show();
		
		Emp abhishek1= new Emp();
		abhishek1.eId=2;
		abhishek1.salary=2000000000;
		abhishek1.name="Abhishek Gupta2";
		Emp.CEO="Abhi1";
		
		abhishek1.show();
	//	abhishek1.CEO="new";  // Accessing static variable with object name, works with warnings.
		abhishek.show();
		
		
          Emp.CEO="new";
           
		abhishek.show();
		abhishek1.show();
		
	}

}
