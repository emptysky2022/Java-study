package sec06;

public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers p = new Papers("안녕하세요!");
		Printable prn = p.getPrinter();
		prn.print();
		new Papers("반갑습니다!").getPrinter().print();
	}
}
