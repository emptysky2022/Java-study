package sec02;

@FunctionalInterface
interface UseThis {
	void use();
}

public class UseThisDemo {
	public void lambda() {
		String hi = "Hi!";

		UseThis s1 = new UseThis() {
			@Override
			public void use() {
				// UseThis interface : 지역객체 자신, 익명 객체
				System.out.println(this);
			}
		};
		s1.use();

		UseThis s2 = () -> {
			// UseThisDemo class : 람다식을 사용하는 UseThisDemo객체
			System.out.println(this);
		};
		s2.use();
	}

	@Override
	public String toString() {
		return "UseThisDemo";
	}

	public static void main(String[] args) {
		new UseThisDemo().lambda();
	}
}
