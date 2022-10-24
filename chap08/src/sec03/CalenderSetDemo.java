package sec03;

import java.util.Calendar;

public class CalenderSetDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, 9, 24);
		System.out.println(toString(c));
		c.set(Calendar.YEAR, 2021);
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DATE, 22);
		System.out.println(toString(c));
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 20);
		c.set(Calendar.SECOND, 30);
		System.out.println(toString(c));
		c.add(Calendar.DATE, 5);
		System.out.println(toString(c));
		c.add(Calendar.DATE, 15);
		System.out.println(toString(c));
		c.add(Calendar.DATE, -15);
		System.out.println(toString(c));
		c.add(Calendar.MONTH, -3);
		System.out.println(toString(c));
		c.roll(Calendar.DATE, 10);
		System.out.println(toString(c));

	}

	public static String toString(Calendar c) {
		String date = c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH) + 1) + "월 " + c.get(Calendar.DATE) + "일 "
				+ c.get(Calendar.HOUR_OF_DAY) + "시 " + c.get(Calendar.MINUTE) + "분 " + c.get(Calendar.SECOND) + "초";
		return date;
	}
}
