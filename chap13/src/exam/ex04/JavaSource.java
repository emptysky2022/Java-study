package exam.ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JavaSource {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String path = "C:\\Temp\\" + br.readLine() + ".java";
		Path p = Path.of(path);
		List<String> str = Files.readAllLines(p);
		for (int i = 0; i < str.size(); i++)
			System.out.println((i + 1) + "행 : " + str.get(i));
	}
}
