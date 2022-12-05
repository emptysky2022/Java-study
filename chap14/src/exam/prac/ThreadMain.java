package exam.prac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMain {
	public static void main(String[] args) {
		int alphabet = 'a';
		// 1번
		Worker worker = new Worker();
		worker.start();
		int count = 0;
		while (worker.isAlive()) {
			System.out.println((char) (alphabet + count++));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		// 2번
		Thread worker2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		worker2.start();
		count = 0;
		while (worker2.isAlive()) {
			System.out.println((char) (alphabet + count++));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		// 3번
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable task = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};
		Future<?> future = exec.submit(task);
		count = 0;
		while (!future.isDone()) {
			System.out.println((char) (alphabet + count++));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		exec.shutdown();

	}
}
