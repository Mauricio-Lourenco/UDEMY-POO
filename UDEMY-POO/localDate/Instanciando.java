package localDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciando {

	public static void main(String[] args) {
		//https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		// TEXTO ISO 8601
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-01-19");
		LocalDateTime d05 = LocalDateTime.parse("2023-01-19T01:30:26");
		Instant d06 = Instant.parse("2023-01-19T01:30:26Z");
		Instant d07 = Instant.parse("2023-01-19T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
		LocalDate d09 = LocalDate.parse("21/07/2023 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2023, 07, 20, 01, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());

	}

}
