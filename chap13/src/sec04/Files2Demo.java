package sec04;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Files2Demo {
	public static void main(String[] args) throws IOException {
		Charset cs = Charset.defaultCharset();
		Path p = new File("C:\\Temp\\new.txt").toPath();

		if (Files.notExists(p))
			Files.createFile(p);

		byte[] data = "좋은 아침!\n잘 가세요!\n".getBytes();
		Files.write(p, data, StandardOpenOption.APPEND);

		List<String> lines = Files.readAllLines(p, cs);
		for (String line : lines)
			System.out.println(line);

	}
}
