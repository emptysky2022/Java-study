package sec03;

class Counter extends Thread {
	private int count = 0;

	Counter(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while (count++ < 5) {
			System.out.print(getName() + " -> ");
			try {
				sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}

}

public class PriorityDemo {
	public static void main(String[] args) {
		Counter c1 = new Counter("느긋한");
		Counter c2 = new Counter("급한");
		c1.setPriority(Thread.MIN_PRIORITY);
		c2.setPriority(Thread.MAX_PRIORITY);
		c1.start();
		c2.start();

	}
}
