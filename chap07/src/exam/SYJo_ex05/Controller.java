package exam.SYJo_ex05;

public abstract class Controller {
	boolean power;

	public Controller(boolean power) {
		this.power = power;
	}

	void show() {
		System.out.print(getName() + "가 ");
		if (power)
			System.out.println("켜졌습니다.");
		else
			System.out.println("꺼졌습니다.");
	}

	abstract String getName();
}
