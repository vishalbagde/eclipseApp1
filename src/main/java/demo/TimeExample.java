package demo;

import java.time.LocalDate;
import java.time.Month;

public class TimeExample {
	
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Current date:"+today);
		
		LocalDate fd2014=LocalDate.of(2014, Month.JANUARY,1);
		System.out.println("Current date:"+fd2014);
	}
	
	

}
