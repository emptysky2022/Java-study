package exam.prac;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOTest {
	public static void main(String[] args) {
		String fileName = "C:\\Temp\\file.txt";

		try {
			byte[] buf = new byte[100];
			// 1번
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);

			buf = bis.readAllBytes();
			for (byte b : buf) {
				System.out.print((char) b);
			}

			fis.close();
			bis.close();
			System.out.println("\n\n\n");

			// 2번
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			long count = br.lines().count();
			br = new BufferedReader(new FileReader(fileName));
			for (int i = 0; i < (int) count; i++) {
				System.out.println(br.readLine());
			}

			System.out.println("\n\n\n");
			// 3번
			Path p = new File(fileName).toPath();
			Files.lines(p).forEach(e -> System.out.println(e));

		} catch (FileNotFoundException e) {
			System.out.println(fileName + " 파일을 열 수 없습니다.");
		} catch (IOException e) {
			System.out.println(fileName + " 파일을 읽을 수 없습니다.");
		}
	}
}
