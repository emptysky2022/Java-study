package sec04;

public class Cook implements Runnable {
	private final Dish dish;

	public Cook(Dish dish) {
		super();
		this.dish = dish;
	}

	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while (!dish.isEmpty())
				dish.wait();
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비되었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				cook(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}

}
