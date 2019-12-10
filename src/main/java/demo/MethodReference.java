package demo;

import java.util.*;

interface Parser{
	public String parse(String str);
}

class StringParser{
	public String convert(String str)
	{
		return str.toUpperCase();
	}
}
class MyPrinter {
	public void print(String str,Parser p) {
		str=p.parse(str);
		System.out.println(str);
	}
}
public class MethodReference {
	public static void main(String[] args) {
		List<String> a = Arrays.asList("vishal", "akash", "mona", "nutan", "yogi");

		//a.forEach((str) -> System.out.println(str));
		//a.forEach(System.out::println);
				
		MyPrinter printer = new MyPrinter();
		
		StringParser st =new StringParser();
		
		printer.print("hello world", new StringParser()::convert);
			
	}
}
