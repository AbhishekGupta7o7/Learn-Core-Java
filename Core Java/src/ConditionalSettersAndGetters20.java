
public class ConditionalSettersAndGetters20 {
	
	private int value;
	public int getValue(String s) {
	   int k= 404;
		String user= "Authorized";
		if(s==user)
		{return value;}
		
		else 
		{
			return k;
		}
	}

	public void setValue(int value) {
		
		if(value>10)
		{  this.value = value; }
		else
		{
			System.out.println("Value can not be smaller then 11");
		}
	}
	
	

}
