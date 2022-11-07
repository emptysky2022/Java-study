package sec04;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1Demo {
	public static void main(String[] args) {
		File file = new File("C:\\Windows");
		File[] fs = file.listFiles();

		Stream<File> stream = Arrays.stream(fs);
		long count = stream.filter(x -> !(x.isDirectory())).count();

		System.out.println(file.toPath() + "에 있는 파일 개수 : " + count);

		stream = Arrays.stream(fs);
		count = stream.filter(x -> x.isDirectory()).count();

		System.out.println(file.toPath() + "에 있는 폴더 개수 : " + count);

	}
}
