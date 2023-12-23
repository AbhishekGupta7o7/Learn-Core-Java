
public class ArrayIndexException38 {

	public static void main(String[] args) {
		int a[]= new int[1];
		
		
		try
		{
		for(int i=0;i<=1;i++)
		{
			a[i]=i+1;
			System.out.println("Hello");
		}
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Maximum number of asignments to array can be one");
		}
		
		

	}

}
