package exam.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringLengthDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("갈매기", "나비", "다람쥐", "라마"));
		Stream<String> stream = list.stream();
		stream.filter(e -> (e.length() > 2)).forEach(System.out::println);

	}
}
