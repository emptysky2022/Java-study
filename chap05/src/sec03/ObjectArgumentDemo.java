package sec03;

public class ObjectArgumentDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.getRadius());
		zero(c2.getRadius());
		System.out.println("원(c2)의 반지름 : " + c2.getRadius());
	}

	private static void zero(double r) {
		// TODO Auto-generated method stub
		r = 0.0;
	}

	private static void zero(Circle c) {
		// TODO Auto-generated method stub
		c.setRadius(0.0);
	}
}
