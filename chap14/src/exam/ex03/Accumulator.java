package exam.ex03;

import java.util.Random;

public class Accumulator extends Thread {
	public int count;
	public int sum = 0;

	public Accumulator(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		while (count > 0) {
			int result = new Random().nextInt(10);
			System.out.println(Thread.currentThread().getName() + " : " + result);
			count--;
			sum += result;
		}
	}

	public int getSum() {
		return sum;
	}
}
