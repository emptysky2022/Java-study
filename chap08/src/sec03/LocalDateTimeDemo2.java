package sec03;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.of(2022, 4, 25, 10, 20);
		System.out.println("현재 시간 : " + now);

		LocalDateTime air1 = LocalDateTime.of(2022, 6, 23, 11, 30);

		LocalDateTime air2 = LocalDateTime.of(2022, 6, 22, 17, 30);
		Duration between;
		// 방법 1 : 몇일 남았는지 계산후 -값 비교
		Duration fast = Duration.between(air1, air2);
		if (fast.isNegative())
			between = Duration.between(now, air2);
		else
			between = Duration.between(now, air2);
		// 방법 2 : 둘중 빠른 것 확인
		LocalDateTime myAir;
		if (air1.isBefore(air2))
			myAir = air1;
		else
			myAir = air2;
		between = Duration.between(now, myAir);
		System.out
				.println("비행 탑승까지 " + between.toDays() + "일 " + (between.toHours() - between.toDays() * 24) + "시간 남음");

	}
}
