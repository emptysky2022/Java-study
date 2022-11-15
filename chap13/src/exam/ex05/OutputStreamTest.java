package exam.ex05;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;

		for (int i = '0'; i < '9' + 1; i++)
			os.write(i);
		for (int i = 'A'; i < 'Z' + 1; i++)
			os.write(i);

		os.flush();
	}
}
