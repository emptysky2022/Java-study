package exam;

public class PrinterTest {
	// 1번 문제

//	public static void main(String[] args) {
//		Printer myPrinter = new Printer();
//
//		myPrinter.numOfPapers = 100;
//		myPrinter.print(70);
//		System.out.println("남은 용지 : " + myPrinter.numOfPapers);
//
//	}

	// 2번 문제
//	public static void main(String[] args) {
//		Printer p = new Printer(10);
//		p.print(2);
//		p.print(20);
//		p.print(10);
//		int a = 10, b = 20;
//		int c = (a == b) ? a : b;
//	}

	// 3번 문제
	public static void main(String[] args) {
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}
