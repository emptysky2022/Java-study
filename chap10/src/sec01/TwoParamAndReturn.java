package sec01;

public class TwoParamAndReturn {
	public static void main(String[] args) {
		Calculate c;

		c = new Calculate() {
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
		};
		c = (int a, int b) -> {
			return a + b;
		};
		c = (a, b) -> {
			return a + b;
		};
		c = (a, b) -> a + b;
		System.out.println(c.cal(1, 2));

		Calculate2 c2;
		// 함수형 인터페이스(추상 메서드가 하나인 인터페이스)에서만 사용 가능, 추상 메서드가 하나인 추상 클래스에서 사용 불가능
//		c2 = (a, b) -> a + b;
	}
}
