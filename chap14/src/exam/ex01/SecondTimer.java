package exam.ex01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SecondTimer {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			int count = 1;
			while (true) {
				System.out.println(count++);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};
		Thread thread1 = new Thread(task1);
		thread1.start();

		ExecutorService exec = Executors.newCachedThreadPool();
		exec.submit(task1);
		exec.shutdown();
	}
}