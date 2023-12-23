import java.util.ArrayList;
import java.util.List;

public class List36 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("mango");
		l.add("apple"); // add method adds at the end of the list
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println("'mango is at index 0'");

		l.add(0, "abhishek");
		System.out.println(l.get(0));
		System.out.println(l.contains("mango"));
		System.out.println(l.contains("mangoes"));
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println("As we added 'Abbhisek' at 0 index so 'mango' moved to index 1");

		System.out.println(l);
		System.out.println("Iterating list via for each loop");
		for (String i : l) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println();

		List<String> l1 = new ArrayList<String>();
		l1.add("L1"); // adding element to l1 list
		l1.add("L2");

		System.out.println(l1);
		System.out.println("Printing elements of l1 List");
		for (String i : l1) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println();

		System.out.println("addAll method is used to add into one List using another list");
		l.addAll(l1);

		System.out.println(l);
		System.out.println("printing elements of List L after using add all");
		for (String i : l) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println();

		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);

		System.out.println(l3);

		System.out.println("Printing elements of first List L3");
		for (int i : l3) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println();
        
		
		
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(5);
		l4.add(6);
		l4.add(7);

		System.out.println(l4);
		System.out.println("Printing elements of second List L4");

		for (int i : l4) {
			System.out.println(i);
		}
		
		System.out.println("L3 does not contains all the elements of L4 so "+l3.containsAll(l4));
		
		System.out.println();
		System.out.println();
		l3.addAll(2, l4); // inserting from second Index i.e position 3
 
		System.out.println(l3);
		System.out.println("printing elements of first List l3 after using addAll Index based method");
		for (int i : l3) {
			System.out.println(i);
		}
		
		System.out.println("L3 contains all the elements of L4 so "+l3.containsAll(l4));
		System.out.println();
		System.out.println();
		
	
		List<Double> l5 = new ArrayList<Double>();
		
		// Double After decimal stores 17 digits, where 17th is Rounded off

		l5.add(1.01234567890123456789); 
		l5.add(2.0);
		//l5.add(2);  // Gives error as List of double type. 
		
		System.out.println(l5);
		for(double i:l5)
		{
			System.out.println(i);
		}
      
		System.out.println();
		System.out.println();
		
		l5.clear();
		
		System.out.println(l5);  // prints empty array
		System.out.println(l5.contains(1.0));
		
		for(double i:l5)
		{
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		
		List<Float> l6= new ArrayList<Float>();
		l6.add(12.1234566789f);  //Float After decimal stores 6 digits, where 6th is Rounded off
		l6.add(12.12345789f);
		l6.add(12.12345719f);
		//l6.add(12.12345);  
// gives error as at last f is not mentioned so it's considered as double and List is float
		System.out.println(l6);
		System.out.println(l6.contains(12.1234566789f));
		
		List<Float> l7= new ArrayList<Float>();
		l7.add(12.1234566780f);  //Float After decimal stores 6 digits, where 6th is Rounded off
		l7.add(12.12345789f);
		l7.add(12.12345719f);
		
		System.out.println(l7);
		System.out.println("First element was different but it gets rounded off");
		System.out.println("As l6 and l7 contains same elements");
		System.out.println(l6.equals(l7));
		
		System.out.println("Checking how many elements are present in List "+l7.size());
		System.out.println();
		
		System.out.println("Printing hashcode of list "+l7.hashCode());
		System.out.println();
		System.out.println("Check if list is empty or not "+l7.isEmpty());
		System.out.println();
		l7.clear();  
		System.out.println("Check if list is empty or not "+l7.isEmpty());
		System.out.println();
		
		
	}

}
