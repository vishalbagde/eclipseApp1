package demo;

import java.util.*;

public class StreamApiExample1 {
	
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,40,50,20,30);
		
		Iterator<Integer> i=l.iterator();
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		//enhance for loop
		for(Integer value : l)
		{
			System.out.println(value.toString());
		}
				
	}
	
	

}
