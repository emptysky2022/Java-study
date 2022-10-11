package practice;

import java.util.Scanner;

public class SecondToTime {
	public static void main(String[] args) {
		int secInput;
		Scanner in = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요 : ");
		secInput = in.nextInt();

		System.out.println(secInput / 3600 + "시간 " + secInput % 3600 / 60 + "분 " + secInput % 60 + "초");
	}
}
