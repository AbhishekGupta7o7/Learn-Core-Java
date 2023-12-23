
public class CallingConditionalSettersAndGetters19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConditionalSettersAndGetters20 o1= new ConditionalSettersAndGetters20();
		
		o1.setValue(11);
		System.out.println(o1.getValue("Authorized"));
		
		o1.setValue(5);
		System.out.println(o1.getValue("Authorized"));
		
		o1.setValue(11);
		System.out.println(o1.getValue("fdgAuthodrized"));

	}

}
