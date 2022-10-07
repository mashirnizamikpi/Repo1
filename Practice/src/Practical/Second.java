package Practical;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Second{
	
	
	public static void CheckingChronoEnum() {
	
	LocalDate date = LocalDate.now();
	System.out.println("Current date is :"+date);
	
	
	LocalDate year = date.plus(8, ChronoUnit.YEARS);
	System.out.println("Next year is :"+year);
	

	

}
	
	public static void main(String[] args) {
		
		CheckingChronoEnum();	
		
	}
}