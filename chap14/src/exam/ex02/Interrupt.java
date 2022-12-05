package exam.ex02;

import java.util.Scanner;

public class Interrupt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						System.out.println("작업 실행중...");
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					System.out.println("작업 완료.");
				}
			}
		});
		thread.start();
		while (sc.nextInt() != 1) {
		}
		thread.interrupt();
	}
}
