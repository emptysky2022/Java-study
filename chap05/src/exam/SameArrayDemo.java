package exam;

public class SameArrayDemo {
	public static boolean isSameArray(int[] a, int[] b) {
		boolean sameCheck = true;
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				sameCheck = false;
				break;
			}
		}
		return sameCheck;
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 1, 5 };
		int[] b = { 3, 2, 4, 1 };
		int[] c = { 3, 2, 4, 1, 5 };
		int[] d = { 2, 7, 1, 8, 2 };
		System.out.println(isSameArray(a, b));
		System.out.println(isSameArray(c, d));
		System.out.println(isSameArray(a, c));
	}
}
