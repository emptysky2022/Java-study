package exam;

public class ArrayReverseDemo {
	public static int[] reverse(int[] org) {
		int begin = 0, end = org.length - 1, tmp;
		while (begin < end) {
			tmp = org[begin];
			org[begin] = org[end];
			org[end] = tmp;

			begin++;
			end--;
		}

		return org;
	}

	public static void main(String[] args) {
		int[] org = { 1, 2, 3, 4, 5 };
		reverse(org);

		for (int i : org)
			System.out.print(i + " ");
	}
}
