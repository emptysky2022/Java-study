package sec04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Stream2Demo {
	public static void main(String[] args) throws IOException {
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		Path p = new File("C:\\Temp\\number.txt").toPath();

		Files.deleteIfExists(p);

		if (Files.notExists(p))
			Files.createFile(p);

		for (String s : number)
			Files.write(p, (s.length() + "\n").getBytes(), StandardOpenOption.APPEND);

		Stream<String> s = Files.lines(p);

		s.forEach(x -> System.out.println(x));

		s = Files.lines(p);

		s.map(x -> number[Integer.parseInt(x)]).forEach(x -> System.out.println(x + ""));

	}
}
