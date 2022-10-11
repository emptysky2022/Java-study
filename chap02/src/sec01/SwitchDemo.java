package sec01;

public class SwitchDemo {
	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 3:
			System.out.print("*");
		case 2:
			System.out.print("*");
		case 1:
			System.out.print("*");
		default:
			System.out.print("&");
		}
	}
}
