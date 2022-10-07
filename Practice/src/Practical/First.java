package Practical;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class First {
	
	public static void Checking() {
		
	LocalDateTime current= LocalDateTime.now();
		
		LocalDate date2 = LocalDate.of(2022,1,26);
		
	

	
	Month month = date2.getMonth();
	int day = date2.getDayOfMonth();
//First Question Solution
	int year=date2.getYear();
	System.out.println("Month: "+month+"  day :"+day+" year: "+year);
	//Second Question Solution	
	LocalDateTime specificDate=current.withDayOfMonth(7).withMonth(10).withYear(2030);
	System.out.println("specific date with current time :"+specificDate);
	
	
	

	


}
	
	public static void main(String[] args) {
		
		Checking();	
		
	}
}