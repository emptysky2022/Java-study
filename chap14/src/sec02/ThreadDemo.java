package sec02;

public class ThreadDemo {
	public static void main(String[] args) {
		// 1.
//		Thread t = new Thread(new MyRunnable());
//		t.start();

		// 2.
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("잘가. ");
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//					}
//				}
//			}
//		}).start();

		// 3.
		new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("잘가. ");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		}).start();

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("잘가. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}
