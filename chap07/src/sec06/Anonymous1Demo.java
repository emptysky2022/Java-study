package sec06;

public class Anonymous1Demo {
	Bird e = new Bird() {
		@Override
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		public void sound() {
			System.out.println("휘릭~~~.");
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo m = new Anonymous1Demo();
		m.e.move();
//		m.e.sound();
	}
}
