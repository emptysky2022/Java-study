package sec03;

public class DaemonDemo {
	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t = new Thread(task, "작업 스레드");
//		t.setDaemon(true);
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드가 끝났습니다.");
	}
}
