package exam;

public class Complex {
	private double c1, c2;

	public Complex(double c1, double c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public Complex(double c1) {
		this(c1, 0.0);
	}

	public void print() {
		System.out.println(c1 + " + " + c2);
	}
}
