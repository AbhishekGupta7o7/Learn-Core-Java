
public class String29 {

	public static void main(String[] args) {
		String s1= "abhi";
		String s2="abhi";
		System.out.println(s1==s2);  // returned true as they are pointing to same memory area. 
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3= new String("abhi");
		String s4= new String("abhi");
		
		System.out.println(s3==s4); // returned false as they are pointing to different memory area. 
		
		
		System.out.println(s1==s3); // false as s1 and s3 are pointing to different memory addressess.
		System.out.println(s1.equals(s3));  // true as s1 and s3 are having same values
		
		
		String s5= s4.intern();      // s5 points to the string returned by intern in the string constant pool
		
		/*The task of intern() is to put the string (which is passed to the intern method) 
		 * into the string constant pool. When an intern method is invoked if the
		 *  string constant pool already contains a string equal to the String object 
		 *  as determined by the equals(Object) method, the String from the pool is returned. 
		 *  Otherwise, the String object is added to the pool and a refrence to the string
		 *   Object is returned. 
*/

		
		// s4.intern returned String, as "abhi" already exists in the String constant pool
		System.out.println(s5==s1);  // will return true  as s5 and s1 are pointing to same address in the scm
		System.out.println(s5==s4); //false as s4 and s5 are pointing to different memory addressess.
		
		
		// STRINGS ARE IMMUTABLE IN JAVA
		
		String ss1="code";
		System.out.println("Ss1 hashcode "+ss1.hashCode());
		
		ss1= ss1+ " decode";  //when we did so jvm create new string in the scm and s8 start pointing to it   //                                as per our code
		System.out.println("Ss1 hashcode "+ss1.hashCode());
		System.out.println(ss1);
		// Hence proved strings are immutable in java as both hashcodes are different
		
		
		
		String s8= "code";
		System.out.println("S8 hashcode "+s8.hashCode());
		System.out.println(s8);
		String s9= s8+ " decode"; 
		System.out.println("S9 hashcode "+s9.hashCode());
		System.out.println(s9);
		
		String s10 ="code";
		System.out.println("s8 adfgdfgdfnd s10" +(s10==s8));
		System.out.println("S8 hashcode "+s8.hashCode());
		System.out.println("S10 hashcode "+s10.hashCode());
		
		s8= s8+ " decode";   

		System.out.println("Updated s8 hashcode"+s8.hashCode());
		System.out.println(s8);
		
		System.out.println(s8==s9);     // WHY DOUBT
		System.out.println(s9.equals(s8));
		
	}

}
