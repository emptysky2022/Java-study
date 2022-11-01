package sec02;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();

		s1.push("사과");
		s1.push("바나나");
		s1.push("체리");

		System.out.println(s1.peek());

		for (String s : s1)
			System.out.print(s + " ");
		System.out.println();

		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println();

		for (String s : s1)
			System.out.print(s + " ");

		Stack<Integer> s2 = new Stack<>();

		s2.add(10);
		s2.add(20);
		s2.add(1, 100);

		for (int value : s2)
			System.out.print(value + " ");
		System.out.println();

		while (!s2.isEmpty())
			System.out.println(s2.pop() + " ");

	}
}
