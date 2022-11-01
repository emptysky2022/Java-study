package exam.SYJo_ex01;

import java.util.Arrays;

interface MethodRef {
	void sortMethod(String[] arr);
}

class MethodReff {
	public static void sort(String[] arr) {
		Arrays.sort(arr, (x, y) -> x.compareToIgnoreCase(y));
	}
}

public class ArraySort {
	public static void main(String[] args) {
		String[] arr = { "K", "o", "r", "e", "a", "n" };
		System.out.print("정렬 전 : ");
		for (String s : arr)
			System.out.print(s + " ");
		System.out.println();

		// 람다식
//		Arrays.sort(arr, (x, y) -> x.compareToIgnoreCase(y));
//		System.out.print("정렬 후 : ");
//		for (String s : arr)
//			System.out.print(s + " ");
//		System.out.println();

		// 메서드참조
//		MethodRef c;
//		c = Arrays::sort;
//		c.sortMethod(arr, (x, y) -> x.compareToIgnoreCase(y));
//		System.out.print("정렬 후 : ");
//		for (String s : arr)
//			System.out.print(s + " ");
//		System.out.println();

		// 메서드참조 더더
		MethodRef sortMethod;
		sortMethod = MethodReff::sort;
		sortMethod.sortMethod(arr);
		System.out.print("정렬 후 : ");
		for (String s : arr)
			System.out.print(s + " ");
		System.out.println();
	}
}
