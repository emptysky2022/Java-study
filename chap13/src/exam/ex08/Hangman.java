package exam.ex08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	static char input;

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:\\Temp\\words.txt");
		String[] str = new String[10];
		BufferedReader br = new BufferedReader(new FileReader(p.toFile()));
		for (int i = 0; i < 10; i++)
			str[i] = br.readLine();

		String word = str[new Random().nextInt(10)];

		Hangman.play(word);

	}

	static void play(String word) {
		Scanner sc = new Scanner(System.in);
		int count = 6;
		int len = word.length();
		boolean clear = true;
		ArrayList<Character> lists = new ArrayList<>();
		char[] answer = new char[len];
		for (int i = 0; i < len; i++) {
			answer[i] = '-';
		}
		while (count > 0) {
			clear = true;
			System.out.print("추측할 단어입니다 : ");
			for (char c : answer)
				System.out.print(c);
			System.out.print("\n지금까지 추측한 내용입니다 : ");
			for (int i = 0; i < lists.size(); i++)
				System.out.print(lists.get(i));
			System.out.print("\n추측할 문자를 입력하세요 : ");
			lists.add(sc.nextLine().charAt(0));
			input = lists.get(lists.size() - 1);
			if (word.chars().filter(e -> e == input).findFirst().orElse(-1) != -1) {
				for (int i = 0; i < len; i++) {
					if (word.charAt(i) == input)
						answer[i] = input;
				}
				for (int i = 0; i < len; i++) {
					if (answer[i] == '-') {
						clear = false;
						break;
					}
				}
				if (clear) {
					System.out.println("정답을 맞추셨습니다.");
					System.out.println("정답 : " + word);
					break;
				}
				System.out.println("정확한 추측입니다 - " + count + "번 더 추측할 수 있습니다");

			} else {
				count--;
				if (count == 0) {
					System.out.println("실패하셨습니다.");
					System.out.println("정답 : " + word);
					break;
				}
				System.out.println("틀렸습니다 - " + count + "번 더 추측할 수 있습니다.");
			}
		}
	}
}
