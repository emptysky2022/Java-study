package sec03;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("오늘 : " + today);

		LocalDate Xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("크리스마스 : " + Xmas);

		Period Dday = Period.between(today, Xmas);
		System.out.println("크리스마스까지 " + Dday.getMonths() + "개월 " + Dday.getDays() + "일 남음");

		Period sat = Period.between(today, LocalDate.of(2022, 11, 17));
		System.out.println("수능까지 " + sat.getDays() + "일 남음");
	}
}
