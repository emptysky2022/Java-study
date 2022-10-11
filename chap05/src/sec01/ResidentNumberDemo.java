package sec01;

import java.util.Scanner;

public class ResidentNumberDemo {
	public static void main(String[] args) {
		System.out.print("주민등록번호를 입력해주세요(-포함) : ");
		ResidentNumber rn = new ResidentNumber(new Scanner(System.in).nextLine());
		rn.ResidentNumberParsing();
	}
}
