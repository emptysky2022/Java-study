package sec03;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(45);
		System.out.println(mt);
	}
}
