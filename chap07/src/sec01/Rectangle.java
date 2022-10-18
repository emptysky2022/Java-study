package sec01;

public class Rectangle extends Shape {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}

	@Override
	public double findArea() {
		return width * height;
	}

}
