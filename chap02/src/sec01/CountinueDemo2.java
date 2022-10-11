package sec01;

public class CountinueDemo2 {
	public static void main(String[] args) {
		int num, count = 0;
		for (num = 1; num < 1000; num++) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;
			else {
				count++;
				System.out.println("5의 배수이자 7의 배수인 " + count + "번째 정수 : " + num);
			}
		}
		System.out.printf("5의 배수이자 7의 배수인 정수의 총 개수 : %d", count);
	}
}
