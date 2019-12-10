package demo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample3 {
	public static void main(String[] args) {
		
		//map example
		List<Integer> number =Arrays.asList(2,3,4,5,6,7);
		List square =number.stream().map(x->x*x).collect(Collectors.toList());
		square.forEach(t->System.out.println(t));
		
		
		//filter() example
		List<String> name = Arrays.asList("vishal","shrikant","sashi","maya");
		List result = name.stream().filter(s->s.startsWith("v")).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		
		List<String> address = Arrays.asList("sachin","surat","udhna","bhestan","vapi");
		List addres = address.stream().sorted().collect(Collectors.toList());
		addres.forEach(System.out::println);
		
		
	}
}
	