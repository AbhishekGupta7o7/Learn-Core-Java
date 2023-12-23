
public class Constructor33 {
	
      Constructor33(){
    	  
	System.out.println("Default Constructor");
           }
      
      Constructor33(int k, int j){
    	  k=6;
    	  j=7;
    	  System.out.println(k+ " "+ j);
      }
      
      Constructor33(int i){
    	  this();
    	  i=5;
    	  System.out.println(i);
      }
      

	public static void main(String[] args) {
		Constructor33 a= new Constructor33(5);
		
	}

}
