interface vehicleone{
	int  speed=90;
	public void distance();
	public void isha();
	
}

interface vehicletwo{
	int distance=100;
	public void speed();
	public void isha();
}

class Vehicle  implements vehicleone,vehicletwo{
	public void distance(){
		int  distance=speed*100; 
		System.out.println("distance travelled is "+distance);
	}
	public void speed(){
		int speed=distance/100;
	}
	
	public void isha()
	{
		System.out.println("Hi Isha");
	}
}

class MultipleInheritanceInJavaViaInterface36{
	public static void main(String args[]){
		Vehicle obj= new Vehicle();
		
		System.out.println("Vehicle");
		obj.distance();
		obj.speed();
		obj.isha();
	}
}