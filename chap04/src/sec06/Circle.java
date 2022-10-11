package sec06;

class Circle {
	private double radius;
	private String color;

	public Circle(double r, String c) {
		radius = r;
		color = c;
	}

	public Circle(double r) {
		this(r, "파랑");
	}

	public Circle(String c) {
//		radius = 10.0;
//		color = c;
		this(10.0, c);
	}

	public Circle() {
//		radius = 10.0;
//		color = "빨강";
		this(10.0, "빨강");
	}

	public void show() {
		System.out.println("반지름 : " + radius + "\t색상 : " + color);
	}

}
