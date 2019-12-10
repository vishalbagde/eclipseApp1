package demo;

import java.util.*;

public class StreamApiExample1 {
	
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,40,50,20,30);
		
		//Iterator<Integer> i=l.iterator();
		
		System.out.println(l.stream().map(i->i*2).reduce(null,(c,e)->c+e));
		
		
		
				
	}
	
	

}
