package sec04;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this.radius = 0.0;
	}

	public void setRadius(double radius) {
		if (radius < 1) {
			System.out.println("1 이하의 반지름은 불가능합니다.");
			return;
		}
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	};

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}
