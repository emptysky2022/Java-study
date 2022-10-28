package sec01;

public class OneParamReturn {
	public static void main(String[] args) {
		Printable2 p;

		p = new Printable2() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		p = (String s) -> {
			System.out.println(s);
		};
		p = (s) -> System.out.println(s);
		p = s -> System.out.println(s);
		p.print("Lambda exp 4");
	}
}
