
public class InstanceInitializerBlock31 {

	int a;
	
	InstanceInitializerBlock31()
	{
		System.out.println(a);
	}
	
	{
		a=100;
		System.out.println("InstanceInitializationBlock");
	}
	
	public static void main(String[] args) {
		
		InstanceInitializerBlock31 ab= new InstanceInitializerBlock31();
		InstanceInitializerBlock31 ab1= new InstanceInitializerBlock31();
		
		
	}

}
