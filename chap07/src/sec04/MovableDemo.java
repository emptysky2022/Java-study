package sec04;

public class MovableDemo {
	public static void main(String[] args) {
		Movable m = new Car();

		m.move(5);
//		m.show();

		Car c = (Car) m;
		c.move(10);
		c.show();
	}
}
