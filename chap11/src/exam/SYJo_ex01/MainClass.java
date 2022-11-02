package exam.SYJo_ex01;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("갈매기", "나비", "다람쥐", "라마"));

		list.removeIf(x -> x.length() > 2);
		for (String s : list)
			System.out.print(s + " ");
	}
}
