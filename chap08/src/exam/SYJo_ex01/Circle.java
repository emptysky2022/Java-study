package exam.SYJo_ex01;

public class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if (c.radius == this.radius)
			return true;
		else
			return false;
	}

}
