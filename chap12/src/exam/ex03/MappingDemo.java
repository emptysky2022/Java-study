package exam.ex03;

import java.util.stream.IntStream;

public class MappingDemo {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).forEach(e -> System.out.print("A" + e + " "));
	}
}
