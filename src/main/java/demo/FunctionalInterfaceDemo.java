package demo;

//type of interface
//1.Normal 
//2.Single abstract method - functional Interface
//3.Marker interface

@FunctionalInterface
interface Abc {
	void show();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		String str = "vishal";
		Abc a = () -> {	System.out.println(str);System.out.println(str);};
		Abc b = () -> {	System.out.println(str.length());};
		
		Abc c = ()-> {System.out.println("hellow");	};
		c.show();

				
		a.show();

	}
}
