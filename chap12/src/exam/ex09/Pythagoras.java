package exam.ex09;

import java.util.stream.IntStream;

public class Pythagoras {

	public static void main(String[] args) {
		// 내가 시도했던 모든것들
//		IntStream x = IntStream.range(1, 100);
//		IntStream y = IntStream.range(1, 100);
//		IntStream z = x.filter(e -> {
//			for (int i = e; i < 100; i++)
//				if (Math.sqrt(e * e + i * i) % 1 == 0)
//					return true;
//			return false;
//		});
//		z.forEach(e -> System.out.println(e));
//		Map<Integer, IntStream> theorem = IntStream.range(1, 100).boxed().collect(Collectors.toMap(x -> x,
//				x -> IntStream.range(x, 100)));

//		theorem.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));

		IntStream.range(1, 16)
				.forEach(x -> IntStream.range(x, 16).filter(y -> Math.sqrt(x * x + y * y) % 1 == 0).limit(5).forEach(
						y -> System.out.print("(" + x + ", " + y + ", " + (int) Math.sqrt(x * x + y * y) + ") ")));

	}
}
