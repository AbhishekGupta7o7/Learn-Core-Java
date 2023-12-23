
public class ConstructorOverloading9 {

	 ConstructorOverloading9(int i) {
		
		
		System.out.println(i);
	}

	public ConstructorOverloading9(String string) {
		
		
		System.out.println(string);
	}
	
	
	public ConstructorOverloading9(int i, int j) {
		
		
		System.out.println(i+" "+ j);
	}

	public ConstructorOverloading9(int i, double d) {
		
		System.out.println(i+" "+ d);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConstructorOverloading9 o1= new ConstructorOverloading9(5);
		ConstructorOverloading9 o2= new ConstructorOverloading9(5,10);
		ConstructorOverloading9 o3= new ConstructorOverloading9(5,5.5);
		ConstructorOverloading9 o4= new ConstructorOverloading9("abhi");
	}

}
