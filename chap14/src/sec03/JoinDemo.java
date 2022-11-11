package sec03;

class JoinThread extends Thread {
	int total = 0;

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++)
			total += i;
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread jt = new JoinThread();
		jt.start();
		try {
			jt.join();
			System.out.println("스레드 " + jt.getName() + " 종료 대기");
		} catch (InterruptedException e) {
		}
		System.out.println("총합 : " + jt.total);
	}
}
