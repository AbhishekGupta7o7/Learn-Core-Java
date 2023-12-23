// Static and Non static variables

public class Studentsrecords3  
{  
    /* declaration of instance variables. */  
    public  String name; //public instance  
    String division;    //default instance  
    private static int age;    //private static variable  
    
    public int roll;
    public Studentsrecords3(String sname)    /* Constructor that initialize an instance variable. */ 
    {  
        name = sname;  
    }  
  
    /* Method to intialize an instance variable. */  
    public void setDiv(String sdiv)  
    {  
        division = sdiv;  
    }  
      
    /* Method to intialize an instance variable. */  
    public void setAge(int sage, int a)  
    {  
        age = sage;  
        roll=a;
    }  
  
    /* Method to display the values of instance variables. */  
    public void printstud()  
    {  
        System.out.println("Student Name: " + name );  
        System.out.println("Student Division: " + division);   
        System.out.println("Student Age: " + age);  
        System.out.println("Student Age: " + roll); 
    }  
  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        Studentsrecords3 s = new Studentsrecords3("Monica");  
        s.setAge(14,14);  
        s.setDiv("B");  
        s.printstud();     // Prints 14
        s.setAge(15,15); 
        s.printstud();      // Prints 15
        
        Studentsrecords3 ss = new Studentsrecords3("Monica");  
        ss.setAge(16,16);
        s.printstud();   // increased age using ss object and accessed via s Object
                           // still Prints 16 as it was static variable
        // instance variable roll value is 15
        
        
    }  
}  