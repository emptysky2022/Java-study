package exam;

public class SumExceptFirstDemo {
	public static int sumExceptFirst(int a, int... arr) {
		int result = 0;
		for (int i : arr)
			result += i;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
	}
}
