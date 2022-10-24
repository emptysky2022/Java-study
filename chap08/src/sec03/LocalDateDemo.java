package sec03;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("xmas : " + xmas);
	}
}
