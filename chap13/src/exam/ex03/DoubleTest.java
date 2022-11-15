package exam.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DoubleTest {
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Temp\\double.txt";

		double[] arr = { 10.2, 30.4, 50.6, 21.6, 78.9 };

		DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
		for (double d : arr)
			dos.writeDouble(d);
		DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
		for (int i = 0; i < 5; i++)
			System.out.println(dis.readDouble());

	}
}
