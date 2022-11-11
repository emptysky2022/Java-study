package sec02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo2 {
	public static void main(String[] args) {
		Runnable t = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0)
					System.out.println(name + " : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		};

		Runnable t2 = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 1)
					System.out.println(name + " : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		};

		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(t);
		exec.submit(t2);

		exec.submit(() -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + "스레드");
		});
		exec.shutdown();
	}
}
