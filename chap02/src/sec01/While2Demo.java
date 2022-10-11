package sec01;

public class While2Demo {
	public static void main(String[] args) {
		int i = 1, j = 2;
		while (j <= 9) {
			i = 1;
			System.out.printf("%d단 : \t", j);
			while (i <= 9) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
				i++;
			}
			j++;
			System.out.println();
		}
		System.out.println();
		j = 1;
		while (j <= 9) {
			i = 2;
			while (i <= 9) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
				i++;
			}
			j++;
			System.out.println();
		}
		System.out.println("끝");
	}
}
