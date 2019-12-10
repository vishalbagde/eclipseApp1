package demo;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApiExample1 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 40, 50, 20, 30);

		// Iterator<Integer> i=l.iterator();
		// System.out.println(l.stream().map(i->i*2).reduce(null,(c,e)->c+e));

		 
		Stream s = l.stream();

		Stream<Integer> s1 = s.map(t->t);

		Integer result = (Integer) s1.reduce(0, (t, u) -> t + u);

		System.out.println(l.stream().map(t->t).reduce(0, (t, u) -> Integer.sum(t , u)));

		// s.forEach(System.out::println);
		
			System.out.println(l    .stream()
									.filter(i->i%2==0)
									.reduce(0, (t, u) 
									-> Integer.sum(t , u)));
			
			
			 //Stream.generate(()->Math.random() -> System.out::println);
			

	}
}
