package exam.ex01;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExist {
	public static void main(String[] args) {
		Path p = new File("D:\\Temp\\file.txt").toPath();

		System.out.println("파일이 " + (Files.exists(p) ? "존재합니다" : "존재하지 않습니다."));
	}
}
