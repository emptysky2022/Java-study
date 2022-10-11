package ch01;

public class OperatePromotion {
	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		short result1 = (short) (num1 + num2);
		int result2 = num1 + num2;

		System.out.println(result1);
		System.out.println(result2);

		int fifteen1 = 15;
		System.out.println("int형 10진수 15 : " + fifteen1);
		byte fifteen2 = 0b1111;
		System.out.println("byte형 2진수 0b1111 : " + fifteen2);
		short fifteen3 = 017;
		System.out.println("short형 8진수 017 : " + fifteen3);
		int fifteen4 = 0xF;
		System.out.println("int형 16진수 0xF : " + fifteen4);
		long lightSpeed = 300000L;
		System.out.println("빛의 속력 : " + lightSpeed + "km/s");
	}
}
