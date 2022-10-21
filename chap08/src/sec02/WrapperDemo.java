package sec02;

public class WrapperDemo {
	public static void main(String[] args) {
		Integer bi1 = new Integer(10);

		int i1 = bi1.intValue();
		double d1 = bi1.doubleValue();

		Integer bi2 = 20;
		int i2 = bi2 + 30;
		String s1 = Double.toString(3.14);
		Float pi = Float.parseFloat(s1);
		Float pi2 = Float.valueOf(s1);
		Integer bi3 = Integer.valueOf("11", 16);

		System.out.println("bi1 : " + bi1);
		System.out.println("i1 : " + i1);
		System.out.println("d1 : " + d1);
		System.out.println("bi2 : " + bi2);
		System.out.println("i2 : " + i2);
		System.out.println("s1 : " + s1);
		System.out.println("pi : " + pi);
		System.out.println("pi2 : " + pi2);
		System.out.println("bi3 : " + bi3);

	}
}
