package day9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DemoLocalDate {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate diwali = LocalDate.of(2024, 11,1);
		System.out.println(diwali);
		
		Period timetodiwali = today.until(diwali);
		System.out.println(timetodiwali);
		System.out.println(timetodiwali.getYears()+"year(s)" + timetodiwali.getMonths()+"month(s)" + timetodiwali.getDays()+"day(s)");
		
		long daystodiwali = today.until(diwali, ChronoUnit.DAYS);
		System.out.println(daystodiwali+"days");
		
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);
		LocalDate nextfriday = today.plus(timetodiwali);
		System.out.println(nextfriday);
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime noon = LocalTime.NOON;
		long diff = now.until(noon, ChronoUnit.MINUTES);
		System.out.println(diff);
		
		Duration interval = Duration.between(now, noon);
		System.out.println(interval);
		
		now = now.plusHours(1);
		now = now.plus(10, ChronoUnit.MINUTES);
		System.out.println(now);
		
		LocalDateTime dt = now.atDate(LocalDate.of(2024, 10, 10));
		System.out.println(dt);
		
		
		
	}

}
