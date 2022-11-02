package exam.SYJo_ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GradeDemo {
	public static char grade(List<Integer> list, int score) {
		int grade = Collections.max(list).intValue() - score;
		if (grade <= 10)
			return 'A';
		else if (grade <= 20)
			return 'B';
		else if (grade <= 30)
			return 'C';
		else if (grade <= 40)
			return 'D';
		return 'F';

	}

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int score;
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			score = sc.nextInt();
			if (score < 0)
				break;
			scores.add(score);
		}
		System.out.println("전체 학생은 " + scores.size() + "명이다.");
		System.out.print("학생들의 성적 : ");
		for (int i : scores)
			System.out.print(i + " ");
		System.out.println();
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "점이며 등급은 " + grade(scores, scores.get(i)) + "이다.");
		}
	}
}
