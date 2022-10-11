package sec04;

public class LocalVariabledemo {
	public static void main(String[] args) {
		int a = 0;
		double b;

//		System.out.print(b); 초기화하지 않음
//		System.out.print(a + c); c변수가 존재하지 않음

		int c = 0;

//		public double d = 0.0; 지역변수를 public로 지정 불가능

		for (int e = 0; e < 10; e++) {
//			int a = 1; a를 다시 선언할 수 없다.
			System.out.print(e);
		}

	}
}
