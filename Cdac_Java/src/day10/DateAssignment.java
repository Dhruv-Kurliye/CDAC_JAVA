package day10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAssignment {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate Birthday = LocalDate.of(2003, 6,2);
		System.out.println(Birthday);
		
		Period Age= today.until(Birthday);
		System.out.println(Age);
		
		LocalDate Programmers_Day = LocalDate.of(2025, 9,13);
		System.out.println(Programmers_Day.getDayOfWeek());
		
		
		for(int Month=1; Month<=12; Month++) {
			LocalDate first_day=LocalDate.of(2024, Month, 1);
			
			if (first_day.getDayOfWeek()==DayOfWeek.SUNDAY) {
				System.out.println(first_day.getMonth());
			}
		}
		
		
		 ZoneId mumbai = ZoneId.of("Asia/Kolkata");
	     ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2024, 10, 7, 2, 5), mumbai); 
	     
	     System.out.println(departure);   
	     
         ZoneId newYork = ZoneId.of("America/New_York");
         ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2024, 10, 7, 4, 40), newYork);
         
         System.out.println(arrival);   
         
         Duration flightDuration = Duration.between(departure, arrival);
         System.out.println("Flight Duration: " + flightDuration.toHours() + " hours and " + flightDuration.toMinutesPart() + " minutes.");
	}
}
