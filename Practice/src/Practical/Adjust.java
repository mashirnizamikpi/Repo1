package Practical;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;

public class Adjust  {
	
	
	public static void CheckingAdjusters() {
	
	LocalDate date = LocalDate.now();
	System.out.println("Current date is :"+date);
	
	
LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
System.out.println("firstDayofNextMonth :"+dayOfNextMonth);

LocalDate nextSat = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
System.out.println("Next saturday from now is :"+nextSat);


LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
System.out.println("first day of month is :"+firstDay);




	


}
	
	public static void main(String[] args) {
		
		CheckingAdjusters();	
		
	}
}