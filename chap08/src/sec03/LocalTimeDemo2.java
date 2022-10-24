package sec03;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(14, 20, 20);
		System.out.println("pc이용 시작 시간 : " + start);

		LocalTime end = LocalTime.of(16, 20, 30);
		System.out.println("pc이용 종료 시간 : " + end);

		Duration between = Duration.between(start, end);
		System.out.println(
				"pc이용 시간 : " + between.toHours() + "시간 " + (between.toMinutes() - between.toHours() * 60) + "분 사용");
	}
}
