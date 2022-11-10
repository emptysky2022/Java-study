package exam.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseHashDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("민국", "지우", "하준", "지우", "하준", "지우"));

		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		System.out.println(map);
	}
}
