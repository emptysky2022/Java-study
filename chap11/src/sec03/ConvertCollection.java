package sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ConvertCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("바나나", "사과", "키위", "포도", "사과");
		ArrayList<String> fruits = new ArrayList<>(list);

		for (Iterator<String> itr = fruits.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
		System.out.println();

		HashSet<String> set = new HashSet<>(list);

		for (String s : set)
			System.out.print(s + "\t");
		System.out.println();

		fruits = new ArrayList<>(set);
		for (String s : fruits)
			System.out.print(s + "\t");
		System.out.println();

	}
}
