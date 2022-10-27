package sec01.etc;

public class Rectangle implements Comparable<Rectangle> {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "사각형 [폭 = " + width + ", 높이 = " + height + "]";
	}

	@Override
	public int compareTo(Rectangle o) {
		return o.findArea() - this.findArea();
	}
}
