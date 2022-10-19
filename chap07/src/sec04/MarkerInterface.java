package sec04;

public class MarkerInterface {
	public static void main(String[] args) {
		Printer prn = new Printer();
		Report doc = new Report("Soft fuNNy vIDeos");
		prn.printContents(doc);
	}
}
