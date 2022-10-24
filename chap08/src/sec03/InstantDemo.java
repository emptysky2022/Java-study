package sec03;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println("시작시간 : " + start.getEpochSecond());
		System.out.println("Time files like an arrow.");
		for (int i = 0; i < 1000000; i++) {
			System.out.print("");
		}
		Instant end = Instant.now();
		System.out.println("종료시간 : " + end.getEpochSecond());

		Duration between = Duration.between(start, end);
		System.out.println("시각차(밀리초) : " + between.toMillis());
	}
}
