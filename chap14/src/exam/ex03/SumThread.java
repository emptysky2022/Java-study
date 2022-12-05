package exam.ex03;

public class SumThread {
	public static void main(String[] args) {
		Accumulator thread1 = new Accumulator(3);
		Accumulator thread2 = new Accumulator(2);
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("누적 값 : " + (thread1.sum + thread2.sum));
	}
}
