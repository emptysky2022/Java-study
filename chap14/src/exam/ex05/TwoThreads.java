package exam.ex05;

import java.util.ArrayList;
import java.util.List;

public class TwoThreads {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				ArrayList<String> words = new ArrayList<String>(List.of("Time", "is", "money"));
				for (String s : words) {
					System.out.println(Thread.currentThread().getName() + " : " + s);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};

		Thread thread1 = new Thread(run, "속담1");
		Thread thread2 = new Thread(run, "속담2");
		thread1.start();
		thread2.start();

	}
}
