package sec03;

public class DboxDemo {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<>();
		box.set("Apple", 30);
		System.out.println(box);
	}
}
