package day3_20122025.LesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		//1)Creating Date Time
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDate lf = LocalDate.of(2002, 5, 26);
		LocalDate lf2 = LocalDate.of(2002, Month.MAY, 26);
		LocalTime lt = LocalTime.of(14,10);
		LocalDateTime ldt = LocalDateTime.of(lf2, lt);
		System.out.println(ldt);
		ZoneId zone = ZoneId.systemDefault();
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zone);
		System.out.println(zdt);
		*/
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(date.format(f));
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(date.format(f2));
		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(date.format(f3));
		DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(date.format(f4));
		LocalDateTime ldt = LocalDateTime.of(date, time);
		System.out.println( ldt );

	}

}
