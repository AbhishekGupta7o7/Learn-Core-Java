
public class OverloadingError {

	int displayValue(int value) {
        return value;
    }
	
	 double displayValue(int value) {
	        return value;
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingError example = new OverloadingError();
		System.out.println(example.displayValue(10));  
        System.out.println(example.displayValue(10.1));   
        
        
	}

}




