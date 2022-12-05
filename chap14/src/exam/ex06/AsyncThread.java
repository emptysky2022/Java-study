package exam.ex06;

public class AsyncThread {
	// 1
//	public static void main(String[] args) {
//		Runnable run = new Runnable() {
//			@Override
//			public synchronized void run() {
//				ArrayList<String> words = new ArrayList<String>(List.of("Time", "is", "money"));
//				for (String s : words) {
//					System.out.println(Thread.currentThread().getName() + " : " + s);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					}
//				}
//			}
//		};
//
//		Thread thread1 = new Thread(run, "속담1");
//		Thread thread2 = new Thread(run, "속담2");
//		thread1.start();
//		thread2.start();
//
//	}
	// 2
//	public static void main(String[] args) {
//		Runnable run = new Runnable() {
//			@Override
//			public void run() {
//				ArrayList<String> words = new ArrayList<String>(List.of("Time", "is", "money"));
//				for (String s : words) {
//					System.out.println(Thread.currentThread().getName() + " : " + s);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					}
//				}
//			}
//		};
//
//		Thread thread1 = new Thread(run, "속담1");
//		thread1.start();
//		synchronized (thread1) {
//			try {
//				thread1.wait();
//			} catch (InterruptedException e) {
//			}
//			Thread thread2 = new Thread(run, "속담2");
//			thread2.start();
//		}
//
//	}
}
