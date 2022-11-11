package sec02;

public class MakeThreadMultiDemo {
	public static void main(String[] args) {
		Runnable t = () -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0)
					System.out.print(i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		};

		Runnable t2 = () -> {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1)
					System.out.print(i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		};

		Thread thread = new Thread(t);
		thread.start();
		thread = new Thread(t2);
		thread.start();

	}
}
