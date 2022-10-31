package sec01;

interface Mathematical {
	double calculate(double d);
}

interface Pickable {
	char pick(String s, int i);
}

interface Computable {
	int compute(int x, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

public class MethodRefDemo {
	public static void main(String[] args) {
		Mathematical m;
		Pickable p;
		Computable c;

		// 1번 : 인터페이스 오버라이딩
		m = new Mathematical() {
			@Override
			public double calculate(double d) {
				return Math.abs(d);
			}
		};
		// 2번 : 람다식
		m = d -> Math.abs(d);
		// 3번 : 정적 메서드 참조
		m = Math::abs;
		System.out.println(m.calculate(-50.3));

		// 1번 : 인터페이스 오버라이딩
		p = new Pickable() {
			@Override
			public char pick(String s, int i) {
				return s.charAt(i);
			}
		};
		// 2번 : 람다식
		p = (s, i) -> s.charAt(i);
		// 3번 : 인스턴스 메서드 참조
		p = String::charAt;
		System.out.println(p.pick("안녕, 인스턴스 메서드 참조!", 4));

		Utils utils = new Utils();
		// 1번 : 인터페이스 오버라이딩
		c = new Computable() {
			@Override
			public int compute(int x, int y) {
				return utils.add(x, y);
			}
		};
		// 2번 : 람다식
		c = (x, y) -> utils.add(x, y);
		// 3번 : 인스턴스 메서드 참조(사용자 클래스)
		c = utils::add;
		System.out.println(c.compute((int) m.calculate(-20), 30));

	}
}
