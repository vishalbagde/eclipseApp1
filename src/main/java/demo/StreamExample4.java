package demo;


import java.util.*;
import java.util.stream.Stream;

public class StreamExample4 {
	
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) list.add(i);
		
		//sequancial stream
		Stream<Integer> seqStream =list.stream();
		
		//parrellel stream
		Stream<Integer> perStream =list.stream();
		
		Stream<Integer> higNum =perStream.filter(p->p>90);
		
		higNum.forEach(p->System.out.println("hight num per "+p));
		
		Stream<Integer> higSeqNum =seqStream.filter(p->p>90);
		
		higSeqNum.forEach(p->System.out.println("hight num seq "+p));
		
		
	}	

}
