package sec03;

class StopThread extends Thread {
	private boolean stop;

	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행 중...");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("정상 종료");
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

public class StopDemo {
	public static void main(String[] args) {
		StopThread t = new StopThread();
		t.start();

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
		}
		t.setStop(true);
	}
}
