package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
public static void main(String[] args) {
	LocalDate myDate=LocalDate.now();
	
	System.out.println(myDate);
	
	LocalTime myTime=LocalTime.now();
	
	System.out.println(myTime);
	
	//current date and time
	
	LocalDateTime myDateTime=LocalDateTime.now();
	
	System.out.println("Before format"+myDateTime);
	DateTimeFormatter modDateFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:ss");
	String modDateTime=myDateTime.format(modDateFormat);
	System.out.println("After format :"+modDateTime);
}
}
