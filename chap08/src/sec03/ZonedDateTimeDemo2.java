package sec03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {
	public static void main(String[] args) {
		ZonedDateTime korea = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 13, 20), ZoneId.of("Asia/Seoul"));

		ZonedDateTime paris = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 17, 15), ZoneId.of("Europe/Paris"));

		Duration time = Duration.between(korea, paris);
		System.out.println(time);
	}
}
