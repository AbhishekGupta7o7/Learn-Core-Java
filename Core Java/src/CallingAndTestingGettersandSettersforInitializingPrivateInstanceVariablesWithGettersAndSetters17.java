
public class CallingAndTestingGettersandSettersforInitializingPrivateInstanceVariablesWithGettersAndSetters17 {

	public static void main(String[] args) {
		
		// To achieve encapsulation, we use getters and Setters.
		// Say we have two classes class A and Class B.
		// In class B we will declare variables and add getters and setters methods
		//And then in Class A, we will create object of class B,
		// And using that object we will send values by calling setter methods,
		// And using that object we will call getter methods to print values. 

		InitializingPrivateInstanceVariablesWithGettersAndSetters18 o1=
				new InitializingPrivateInstanceVariablesWithGettersAndSetters18();
		
		o1.setId(5);
		o1.setName("Abhi");
		o1.setRollNo(1);
		
		System.out.println(o1.getId());
		System.out.println(o1.getName());
		System.out.println(o1.getRollNo());

	}
}
