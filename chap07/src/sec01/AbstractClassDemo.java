package sec01;

public class AbstractClassDemo {
	public static void main(String[] args) {
//		Shape s = new Shape();

		Circle c = new Circle(3);
		c.draw();
		System.out.println("원의 넚이는 " + c.findArea());

		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.println("사각형의 넓이는 " + r.findArea());

	}
}
