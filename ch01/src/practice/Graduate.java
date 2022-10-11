package practice;

import java.util.Scanner;

public class Graduate {
	public static void main(String[] args) {
		int major, culture, normal;
		Scanner in = new Scanner(System.in);

		System.out.print("전공 이수 학점 : ");
		major = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		culture = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		normal = in.nextInt();

		System.out.println(major + culture + normal >= 140 && major >= 70
				? culture >= 30 && normal >= 30 || culture + normal >= 80 ? "졸업 가능" : "졸업 불가능"
				: "졸업 불가능");
//		if (major + culture + normal >= 140 && major >= 70) {
//			if (culture >= 30 && normal >= 30) {
//				System.out.println("졸업 가능");
//			} else if (culture + normal >= 80) {
//				System.out.println("졸업 가능");
//			} else
//				System.out.println("졸업 불가능");
//		} else
//			System.out.println("졸업 불가능");
	}
}