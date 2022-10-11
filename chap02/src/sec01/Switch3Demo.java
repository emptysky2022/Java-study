package sec01;

public class Switch3Demo {
	public static void main(String[] args) {
		System.out.println(howMany(1) + " 있다.");
		System.out.println(howMany(2) + " 있다.");
		System.out.println(howMany(3) + " 있다.");
		System.out.println(howMany(0) + " 있다.");
	}

	static String howMany(int n) {
		return switch (n) {
		case 0 -> "빵개";
		case 1 -> "한 개";
		case 2 -> "두 개";
		default -> "많이";
		};
	}
}
