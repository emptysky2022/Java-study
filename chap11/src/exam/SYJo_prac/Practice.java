package exam.SYJo_prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		// 1번
		List<String> capitals = new ArrayList<>(List.of("서울", "워싱턴", "베이징", "마드리드", "파리", "런던"));
		for (String s : capitals)
			System.out.print(s + "\t");
		System.out.println();

		capitals.add("도쿄");
		for (String s : capitals)
			System.out.print(s + "\t");
		System.out.println();

		capitals.removeIf(s -> s.length() >= 3);
		for (String s : capitals)
			System.out.print(s + "\t");
		System.out.println("\n");

		// 2번
		Map<String, String> dic = new HashMap<>(
				Map.of("head", "대가리", "teacher", "쌤", "cat", "짬타이거", "aunt", "아지매", "noodle", "컵누들", "child", "얼라"));

		dic.forEach((x, y) -> System.out.printf("%s=%s ", x, y));
		System.out.println("\n");

		// 3번
		Collection<String> collection = dic.values();
		List<String> list = new ArrayList<>(collection);
		Collections.shuffle(list);
		list.forEach(x -> System.out.printf(x + " "));
	}
}
