package Practical;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date {
	
	public static void LocalDateTimeApi()  {
		
		
		LocalDate date= LocalDate.now();
		System.out.println("the current date is "+date);
		
		LocalTime time= LocalTime.now();
		System.out.println("the current time is "+time);
		
		
		LocalDateTime current= LocalDateTime.now();
		System.out.println("the current date is "+current);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
	
	System.out.println("In formatted manner :"+formatedDateTime);
	
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	int seconds = current.getSecond();
	int hour = current.getHour();
	int year=current.getYear();
	System.out.println("Month: "+month+"  day :"+day+" seconds: "+seconds+" hour: "+hour+" year: "+year);
	
	LocalDate date2 = LocalDate.of(1950,1,26);
	System.out.println("the republic day:"+date2);
	
	LocalDateTime specificDate=current.withDayOfMonth(24).withYear(2016);
	System.out.println("specific date with current time :"+specificDate);
	
	
	}
	
	public static void main(String[] args) {
		
	LocalDateTimeApi();	
		
	}

}
