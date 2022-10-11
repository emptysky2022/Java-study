package sec01;

public class DoWhile3Demo {
	public static void main(String[] args) {
		int i, j = 2;
		do {
			i = 1;
			System.out.printf("%d단 : \t", j);
			do {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				i++;
			} while (i <= 9);
			j++;
			System.out.println();
		} while (j <= 9);
		System.out.println();
		j = 1;
		System.out.println("끝");
	}
}
