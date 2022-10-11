package sec04;

public class ComAssignOp {
	public static void main(String[] args) {
		short num = 10;
		num = (short) (num + 77L);
		int rate = 3;
		rate = (int) (rate * 3.5);

		System.out.println(num);
		System.out.println(rate);

		num = 10;
		rate = 3;

		num += 77L;
		rate *= 3.5;

		System.out.println(num);
		System.out.println(rate);

	}
}