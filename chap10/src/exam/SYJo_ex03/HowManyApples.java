package exam.SYJo_ex03;

import java.util.function.Consumer;

public class HowManyApples {
	public static void main(String[] args) {
		int a = 3, b = 1;

		Consumer<Integer> s = x -> System.out.println((x > 1) ? x + " apples" : x + " apple");
		s.accept(a);
		s.accept(b);

	}
}
