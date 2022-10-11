package sec01;

public class Lotto01 {
	public static void main(String[] args) {
		int lotto1 = 0, lotto2 = 0, lotto3 = 0, lotto4 = 0, lotto5 = 0, lotto6 = 0;
		int i = 1, num;
		while (i <= 6) {
			num = (int) (Math.random() * 45) + 1;
			switch (i) {
			case 1 -> lotto1 = num;
			case 2 -> {
				if (lotto1 == num)
					continue;
				lotto2 = num;
			}
			case 3 -> {
				if (lotto1 == num || lotto2 == num)
					continue;
				lotto3 = num;
			}
			case 4 -> {
				if (lotto1 == num || lotto2 == num || lotto3 == num)
					continue;
				lotto4 = num;
			}
			case 5 -> {
				if (lotto1 == num || lotto2 == num || lotto3 == num || lotto4 == num)
					continue;
				lotto5 = num;
			}
			case 6 -> {
				if (lotto1 == num || lotto2 == num || lotto3 == num || lotto4 == num || lotto5 == num)
					continue;
				lotto6 = num;
			}
			}
			i++;
		}
		System.out.printf("로또 번호 : %d, %d, %d, %d, %d, %d", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);
	}
}
