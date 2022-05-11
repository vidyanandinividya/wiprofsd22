package w5_d5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		Instant i=Instant.now();
		//System.out.println(i);
		//System.out.println(Instant.MIN);
		Instant j=Instant.now();
		Duration d=Duration.between(i, j);
		System.out.println(d);
		System.out.println(d.getNano());
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);
		LocalDate birtDate=LocalDate.of(1992, 11,07);
		Period p=Period.between(birtDate, currentDate);
		System.out.println(p.getYears());
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
		String formatedString=dt.format(dtf);
		System.out.println(formatedString);
		Year y=Year.now();
		System.out.println(y);
		System.out.println(y.isLeap());
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		ZoneId zus=ZoneId.of("America/Chicago");
		ZonedDateTime zdt=ZonedDateTime.now(zus);
		System.out.println(zdt);

	}

}
