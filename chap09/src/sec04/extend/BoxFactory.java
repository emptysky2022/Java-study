package sec04.extend;

public class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.setOb(o);

		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}
