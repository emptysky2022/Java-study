package sec04;

public class OperatorPrecedenceDemo {
	public static void main(String[] args) {
		int a, b, c;
		a = b = c = 3;
		c = a++ + --b * a;
		System.out.println(c);

		int x = 5, y = 10, z = ++x * y--;
		System.out.printf("%d\t%d\t%d\n", x, y, z);

		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

	}
}
