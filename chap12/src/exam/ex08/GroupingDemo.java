package exam.ex08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sec01.Nation;

public class GroupingDemo {
	public static void main(String[] args) {
		Map<Nation.Type, Map<String, List<Nation>>> map = Nation.nations.stream().collect(Collectors
				.groupingBy(Nation::getType, Collectors.groupingBy(rank -> rank.getGdpRank() < 12 ? "선진국" : "개도국")));
		System.out.println(map);
	}
}
