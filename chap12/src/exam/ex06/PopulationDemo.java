package exam.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PopulationDemo {
	static int count = 0;

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던"));
		List<Double> populate = new ArrayList<>(List.of(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9));

		Stream<Population> stream = Stream.generate(() -> new Population(names.get(count), populate.get(count++)))
				.limit(6);
		stream.filter(e -> e.populate > 300.0).forEach(e -> System.out.println(e));
	}
}
