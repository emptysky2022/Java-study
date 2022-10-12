package sec03;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double findArea() {
		return radius * radius * 3.14;
	}

	public void setRadius(double radius) {
		// TODO Auto-generated method stub
		this.radius = radius;
	}
}
