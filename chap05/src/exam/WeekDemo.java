package exam;

import java.util.Scanner;

public class WeekDemo {

	public static void print(Week w) {
		switch (w.ordinal()) {
		case 0, 6 -> System.out.println(w + "은 최고.");
		case 1 -> System.out.println(w + "은 싫다.");
		case 5 -> System.out.println(w + "은 좋다.");
		default -> System.out.println(w + "은 그저 그렇다.");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String weekInput = in.nextLine();
		Week week = Week.valueOf(weekInput.toUpperCase());
		print(week);

	}
}

enum Week {
	SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일	"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");

	private String s;

	private Week(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}