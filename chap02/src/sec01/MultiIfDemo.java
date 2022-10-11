package sec01;

import java.util.Scanner;

public class MultiIfDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score;
		char grade;

		System.out.print("학점을 입력하세요 : ");
		score = in.nextInt();

		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.println("당신의 학점은 " + grade);

		if (score >= 90)
			grade = 'A';
		else {
			if (score >= 80)
				grade = 'B';
			else {
				if (score >= 70)
					grade = 'C';
				else {
					if (score >= 60)
						grade = 'D';
					else
						grade = 'F';
				}
			}
		}
		System.out.println("당신의 학점은 " + grade);

		switch (score / 10) {
		case 10, 9 -> System.out.println("당신의 학점은 A");
		case 8 -> System.out.println("당신의 학점은 B");
		case 7 -> System.out.println("당신의 학점은 C");
		case 6 -> System.out.println("당신의 학점은 D");
		default -> System.out.println("당신의 학점은 F");
		}

	}

}
