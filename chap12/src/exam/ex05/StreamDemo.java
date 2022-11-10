package exam.ex05;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		Double ave = stream.collect(Collectors.averagingInt(x -> x));
		stream = Stream.of(1, 2, 3, 4, 5);
		Double squaredAve = stream.collect(Collectors.averagingInt(x -> x * x));
		stream = Stream.of(1, 2, 3, 4, 5);
		String str = stream.map(x -> x.toString()).collect(Collectors.joining("-"));
		System.out.println("원소 평균 : " + ave);
		System.out.println("원소 제곱 평균 : " + squaredAve);
		System.out.println("원소 : " + str);

	}
}
