
public class ArrayandMethods34 {

	
	// Notice that these all methods are static
	// As main block is static and we are calling these methods 
	// inside main block without Objects
	
	  static int min(int arr[])
	{
		int min= arr[0];
		int i=0;
		while( i<arr.length)
		{
		if(min>arr[i])
			{min=arr[i];}
		i++;
		}
		
		return min;
	}
	
	static void min1(int arr[])
	{
		int min= arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min 1 method Got array from main and Printing minimum element from method "+ min);
	}
	
	
	static int[] abhi()//  passing array from method to main 
	{
	int a[]= {1,2,3,4,5};   // firstly we declared array and then passed it to main
	return a;
		
	}
	
	static int[] abhi1()   // passing anonymous array from method to main 
	
	{
		return new int[] {10,20,30,40};   //we did not declared any array.
	}
	
	
	static void PassingAnnonymousArrayToMethod(int a[])
	{
		System.out.println("Printing elements of annonymous array ");
		for(int i: a)
		{
			
			System.out.println(i);
		}
	}
	
	
	public static void main(String args[])
	{
		/*
		 I can access all static methods with the help of class name
		Arrayandmethods1.abhi();
		Arrayandmethods1.abhi1();
		Arrayandmethods1.min(null);
		Arrayandmethods1.min1(null);
		Arrayandmethods1.PassingAnnonymousArrayToMethod(null);
		
		*/
	   int arr[]= new int[5];   // Declares array and allocating memory
	   arr[0]=12;
	   arr[1]=3213;
	   arr[2]=1;     // initializing values to array
	   arr[3]=12;
	   arr[4]= 0;
	   int a= min(arr); // passing array to method and getting value in return
	   
	   System.out.println("Printing from main, Called min method from main ,"
	   		+ " passed array to it and that method calculates minimum element "
	   		+ "in array and returned that minimum element to main "+a);
	   
	   min1(arr); // passing array to method and getting nothing in return
	   
	   int b[]= abhi();
	   
	   for(int i=0;i<b.length;i++)  {
		   System.out.println(b[i]);  
		   }
	   
	   
int c[]= abhi1();
	   
	   for(int i=0;i<c.length;i++)  {
		   System.out.println(c[i]);  
		   }
	   
	   PassingAnnonymousArrayToMethod(new int[] {1,2,3,4,5});
	   
	   
	}}

