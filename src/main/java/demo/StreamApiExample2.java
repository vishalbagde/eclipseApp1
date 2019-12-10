package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApiExample2 {
	
	public static void main(String[] args) {
		
		try
		{
			FileReader fr=new FileReader("/home/axelor/Desktop/vishal/gradlePractice/build.gradle");
			BufferedReader br=new BufferedReader(fr);
			Stream s =br.lines();
			System.out.println(s.findFirst().get().toString());
			br.lines().forEach(System.out::println);	

		}catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
		
		
	}

}
