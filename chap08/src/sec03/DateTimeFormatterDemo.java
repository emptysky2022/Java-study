package sec03;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
	public static void main(String[] args) {
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2022, 10, 25, 11, 20), ZoneId.of("Asia/Seoul"));
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-M-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-MM-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-MM-d, HH:mm:ss VV");
		DateTimeFormatter fm4 = DateTimeFormatter.ofPattern("yyyy-MM-d, HH:mm:ss E");
		DateTimeFormatter fm5 = DateTimeFormatter.ofPattern("yyyy년 MM월 d일 E요일");

		System.out.println(fm1.format(date));
		System.out.println(date.format(fm2));
		System.out.println(date.format(fm3));
		System.out.println(date.format(fm4));
		System.out.println(date.format(fm5));

		DateTimeFormatter fm6 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E요일");
		System.out.println("오늘 날짜는 " + fm6.format(ZonedDateTime.now()));

	}

}
