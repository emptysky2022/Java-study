package sec08;

public class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("PaperBox Paper Wrapping");
	}

	@Override
	public void wrap() {
		System.out.println("PaperBox Paper Wrapping");
	}
}
