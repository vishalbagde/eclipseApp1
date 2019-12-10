package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

class Student 
{ 
    int rollno; 
    String name, address; 
    
    // Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // USED TO PRINT STUDENT DETAILS IN MAIN() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 

class Sortbyroll implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.rollno - b.rollno; 
    } 
} 
  
class Sortbyname implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Student a, Student b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 

public class CollectionSortExample1 {
	
	public static void main(String[] args) {
		
		 ArrayList<Student> ar = new ArrayList<Student>(); 
	        ar.add(new Student(111, "vishal", "surat")); 
	        ar.add(new Student(131, "akash", "amroli")); 
	        ar.add(new Student(121, "mona", "udhna"));
	        
	 	       
	     ar.forEach((Student t)-> System.out.println(t.rollno+" "+t.name+"  "+t.address));
	     
	     Collections.sort(ar,new Sortbyroll());
	     
	     System.out.println(" ---");
	        
	     ar.forEach((Student t)-> System.out.println(t.rollno+" "+t.name+"  "+t.address));
  
	  
		
		
	}
	

}
