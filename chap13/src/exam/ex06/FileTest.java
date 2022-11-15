package exam.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		String[] animals = { "ant", "bat", "cat", "dog" };

		FileOutputStream fos = new FileOutputStream("C:\\Temp\\animals.txt");

		for (String s : animals) {
			fos.write((s.charAt(0) + " : " + s + "\n").getBytes());
		}
	}
}
