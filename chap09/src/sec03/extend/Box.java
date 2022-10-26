package sec03.extend;

public class Box<T extends Number> {
	private T ob;

	public void set(T ob) {
		this.ob = ob;
	}

	public T get() {
		return ob;
	}
}
