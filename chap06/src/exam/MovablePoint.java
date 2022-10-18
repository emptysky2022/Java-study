package exam;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	@Override
	public String toString() {
		return "( " + getX() + ", " + getY() + " ) , " + xSpeed + ", " + ySpeed;
	}
}
