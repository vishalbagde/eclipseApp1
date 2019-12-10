package demo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class ActionListnerExample {

	public static void main(String[] args) {
	
		
		//java 7 action listner
		ActionListener al = new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				
			}
		};
		
		//java 8 action listner
		ActionListener al1 = e->System.out.println(e.getActionCommand());
		
		
		//printout list string
		List<String> st=Arrays.asList("vishal","akash","yogi");
		for (String string : st) {
			System.out.println(string);
		}
		
		//java 8 foreach
		st.forEach(System.out::println);
		
		
		
		
		
		
	}
}
