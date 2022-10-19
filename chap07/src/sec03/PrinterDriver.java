package sec03;

public class PrinterDriver {
	public static void main(String[] args) {
		String myDoc = "This is a report about ...";

		Printable sprn = new SPrinterDriver();
		sprn.print(myDoc);
		System.out.println();

		Printable lprn = new LPrinterDriver();
		lprn.print(myDoc);

	}
}
