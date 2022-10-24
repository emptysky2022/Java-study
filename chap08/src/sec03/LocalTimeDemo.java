package sec03;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("지금 시각 : " + now);

		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);

		System.out.println("미팅시각 : " + mt);
	}
}
