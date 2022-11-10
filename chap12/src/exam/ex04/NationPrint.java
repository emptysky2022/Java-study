package exam.ex04;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import sec01.Nation;

public class NationPrint {
	public static void main(String[] args) {
		Stream<Nation> nations = Nation.nations.stream();
		String notIsland = nations.filter(x -> !(x.isIsland())).map(x -> x.getName()).collect(Collectors.joining(", "));
		System.out.println(notIsland);
	}
}
