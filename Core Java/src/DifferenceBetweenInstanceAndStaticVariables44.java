
public class DifferenceBetweenInstanceAndStaticVariables44 {

	int i=0;
	static int j=0;
	
	DifferenceBetweenInstanceAndStaticVariables44()
	{
		i++;
		j++;
		
		
		System.out.println("Everytime object gets called value of instance variable starts from 0, as each object shared seperate copy of instance variables.");
		System.out.println("\n"+i);
		System.out.println("Everytime object gets called value of static variable starts from it's latest value, as each object shared one single copy of instance variables.");
		System.out.println("\n"+j);
	
	}
	
	public static void main(String[] args) {
	
		
		DifferenceBetweenInstanceAndStaticVariables44 o1= new DifferenceBetweenInstanceAndStaticVariables44();
		DifferenceBetweenInstanceAndStaticVariables44 o2= new DifferenceBetweenInstanceAndStaticVariables44();
		
		// As two times object gets called value of static variable is 2. 
		

	}

}
