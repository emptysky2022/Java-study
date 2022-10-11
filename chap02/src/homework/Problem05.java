package homework;

public class Problem05 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				for (int k = 1; k <= 20; k++) {
					if (i * i + j * j == k * k && i + j + k <= 20)
						System.out.printf("( %d^2 + %d^2 = %d^2 )", i, j, k);
				}
			}
		}
	}
}
