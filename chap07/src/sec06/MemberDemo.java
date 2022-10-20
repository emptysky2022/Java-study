package sec06;

public class MemberDemo {
	class Eagle extends Bird {
		@Override
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		public void sound() {
			System.out.println("휘릭~~~.");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();
	}
}
