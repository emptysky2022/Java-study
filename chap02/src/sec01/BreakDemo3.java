package sec01;

public class BreakDemo3 {
	public static void main(String[] args) {
		int num = 1, count = 0;

		while (num < 10000) {
			if (num % 5 == 0 && num % 7 == 0) {
				count++;
				if (count == 5)
					break;
			}
			num++;
		}
		System.out.println("while문 반복 횟수 : " + num);
		if (count == 5) {
			count = 0;
			System.out.print("5의 배수이고 7의 배수인 정수 : ");
			for (num = 1; num < 10000; num++) {
				if (num % 5 == 0 && num % 7 == 0) {
					System.out.printf("%d\t", num);
					count++;
					if (count == 5)
						break;
				}
			}
		} else
			System.out.println("찾는 정수가 5개 미만입니다.");

	}
}
