package sec01;

public class LambdaGeneric {
	public static void main(String[] args) {
		GeCalculate<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(3, 4));

		GeCalculate<Double> cd = (a, b) -> a + b;
		System.out.println(cd.cal(3.0, 4.0));
	}
}
