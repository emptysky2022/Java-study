package exam.SYJo_prac;

import java.util.ArrayList;
import java.util.Arrays;

public class Shape {
	private String type;
	private String color;
	private Double area;

	Shape(String type, String color, Double area) {
		this.area = area;
		this.type = type;
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return type + "(" + color + ", " + area + ")";
	}

	public static ArrayList<Shape> shapes = new ArrayList<>(
			Arrays.asList(new Shape("삼각형", "빨간색", 10.5), new Shape("사각형", "파란색", 11.2), new Shape("원", "파란색", 16.5),
					new Shape("원", "빨간색", 5.3), new Shape("원", "노란색", 8.1), new Shape("사각형", "파란색", 20.7),
					new Shape("삼각형", "파란색", 3.4), new Shape("사각형", "빨간색", 12.6)));
}
