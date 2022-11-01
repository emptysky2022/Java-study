package exam.SYJo_ex04;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class IntegerLength {
	public static void main(String[] args) {
		ToIntFunction<Integer> f = x -> x.toString().length();
		UnaryOperator<Integer> u = x -> x.toString().length();

		System.out.println("ToIntFunction : ");
		System.out.println("length(10) = " + f.applyAsInt(10));
		System.out.println("length(100) = " + f.applyAsInt(100));
		System.out.println("length(1000) = " + f.applyAsInt(1000));
		System.out.println();

		System.out.println("UnaryOperator : ");
		System.out.println("length(10) = " + u.apply(10));
		System.out.println("length(100) = " + u.apply(100));
		System.out.println("length(1000) = " + u.apply(1000));

	}
}
