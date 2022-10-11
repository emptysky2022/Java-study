package sec03;

public class CastTest {
	public static void main(String[] args) {
		double d1 = 5 * 3.14; // 5 -> 5.0
		double d2 = 1; // 1 -> 1.0
		int num1 = 50;
		long num2 = 3147483637L;
		System.out.println(num1 + num2); // 50 -> 50L
		double num3 = 30;

		System.out.println(59L + 34.5); // 59L -> 59.0(double)

//		float f1 = 3.14; 					change float to double or 3.14f
//		byte b1 = 300;						change byte to short(int) or value < 128
//		byte x1 = 3.14;						change byte to double or (byte)3.14
		double d = 3.14f;
		double pi = 3.1415;
//		int wholeNumber = pi;				change int to double or (int)pi
		long num11 = 3000000007L;
//		int num22 = num11;					change int to long

	}
}
