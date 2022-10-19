package sec03;

public class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);
		System.out.println("From LG Printer");
	}

}
