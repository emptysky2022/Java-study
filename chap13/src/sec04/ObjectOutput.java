package sec04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {
	public static void main(String[] args) {
		SBox box1 = new SBox("hello", "helloPW");
		SBox box2 = new SBox("java", "1234");

		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
			oo.writeObject(box1);
			oo.writeObject(box2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
