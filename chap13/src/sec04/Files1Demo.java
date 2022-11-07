package sec04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Files1Demo {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:/Temp/org.txt");
		File f2 = new File("C:\\Temp");

		System.out.println("org.txt는 폴더? " + Files.isDirectory(f1.toPath()));

		System.out.println("Temp는 폴더? " + Files.isDirectory(f2.toPath()));

		System.out.println("org.txt는 읽을 수 있는 파일? " + Files.isReadable(f1.toPath()));

		System.out.println("org.txt.의 크기? " + Files.size(f1.toPath()));
	}
}
