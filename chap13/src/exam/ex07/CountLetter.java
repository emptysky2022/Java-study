package exam.ex07;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountLetter {
	static int count = 0;

	public CountLetter(char lookFor, String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		byte[] arr = fis.readAllBytes();
		for (byte b : arr)
			if (lookFor == (char) b)
				count++;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		System.out.print("파일 이름을 입력하세요 : ");
		String fileName = in.nextLine();
		System.out.print("세고자 하는 문자를 입력하세요 : ");
		char lookFor = in.nextLine().charAt(0);

		int count = new CountLetter(lookFor, fileName).count();
		System.out.format("%s 파일에 %c 문자가 %d개 \n", fileName, lookFor, count);
	}

	public int count() {
		return count;
	}
}
