
public class InitializingPrivateInstanceVariablesWithGettersAndSetters18 {

	//Note: - To create getters and setters add variables 
	//In eclipse go to source and click at generate getters and setters. 
	
	private int id;
	private String name;
	private int rollNo;
	private int h;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
		
}
