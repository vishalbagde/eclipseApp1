package demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareJava7And8 {

	public static void main(String[] args) {

		// printout list string
		List<Integer> list = Arrays.asList(90, 70, 40, 50, 70, 50, 30, 30, 20, 100);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		list.forEach(System.out::println);
	}
}
	