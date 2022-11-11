package sec02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("잘가. ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		};

		// 1분동안 동작하지 않으면 종료
//		 ExecutorService exec = Executors.newCachedThreadPool();
//		 exec.execute(task);

		// 스레드 개수 설정
		ExecutorService exec = Executors.newFixedThreadPool(4);
		exec.submit(task);

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		exec.shutdown();
	}
}
