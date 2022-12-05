package exam.ex04;

public class EchoTest {
	public static void main(String[] args) {

		Echoer echoer1 = new Echoer("환영");
		Echoer echoer2 = new Echoer("자바");
		Echoer echoer3 = new Echoer("야호~~~");

		echoer1.start();
		echoer2.start();
		echoer3.start();

	}
}
