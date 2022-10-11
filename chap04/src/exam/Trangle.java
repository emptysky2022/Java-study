package exam;

class Trangle {
	private double base, height;

	public Trangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double findArea() {
		return base * height / 2;
	}

	public boolean isSameArea(Trangle t) {
		if (this.findArea() == t.findArea())
			return true;
		else
			return false;
	}
}
