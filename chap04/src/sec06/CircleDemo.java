package sec06;

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강");
		c1.show();

		Circle c2 = new Circle(5.0);
		c2.show();

		Circle c3 = new Circle("노랑");
		c3.show();

		Circle c4 = new Circle();
		c4.show();
	}
}
