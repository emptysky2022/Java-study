package sec04;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Channel2Demo {
	public static void main(String[] args) throws Exception {
		Path p = Paths.get("C:\\Temp\\data.txt");

		if (Files.notExists(p))
			Files.createFile(p);
		FileChannel fc = FileChannel.open(p, StandardOpenOption.READ, StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);

		ByteBuffer buf = ByteBuffer.allocate(1024);
		String s = "유유상종.\nBirds of a feather flock together.\n시간은 금이다.\nTime is money";

		buf.put(s.getBytes());

		buf.flip();

		int count = fc.write(buf);

		System.out.println("C:\\Temp\\file.txt에 " + count + "바이트 기록");

		buf.clear();
		fc.read(buf);
		System.out.println(new String(buf.array()));

		fc.close();
	}
}
