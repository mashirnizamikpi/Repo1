package Practical;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Chrono {
	
	
	public static void CheckingChronoEnum() {
	
	LocalDate date = LocalDate.now();
	System.out.println("Current date is :"+date);
	
	
	LocalDate year = date.plus(2, ChronoUnit.YEARS);
	System.out.println("Next year is :"+year);
	
	LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
	System.out.println("Next Month is :"+nextMonth);
	
	LocalDate nextWeek = date.plus(1, ChronoUnit.WEEKS);
	System.out.println("Next Week is :"+nextWeek);
	
	LocalDate Decade = date.plus(2, ChronoUnit.DECADES);
	System.out.println("Current date is :"+Decade);
	
	System.out.println("20 years after today"+Decade);
	

}
	
	public static void main(String[] args) {
		
		CheckingChronoEnum();	
		
	}
}