package sec01;

public class Lambda2Demo {
	public static void main(String[] args) {
		Nagative n;
		Printable p;

		n = new Nagative() {
			@Override
			public int neg(int x) {
				return -x;
			}
		};
		n = (int x) -> {
			return -x;
		};
		n = (x) -> {
			return -x;
		};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x;

		p = new Printable() {
			@Override
			public void print() {
				System.out.println("안녕!");
			}
		};
		p = () -> {
			System.out.println("안녕!");
		};
		p = () -> System.out.println("안녕!");
		p.print();
	}
}
