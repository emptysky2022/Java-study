package exam.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CapitalDemo {
	public static void main(String[] args) {
		List<String> capitals = new ArrayList<>(List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던"));

		Stream<String> stream = capitals.stream();

		System.out.println(stream.sorted().findFirst());
	}
}
