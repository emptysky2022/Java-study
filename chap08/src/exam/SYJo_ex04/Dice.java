package exam.SYJo_ex04;

public class Dice {
	public int roll() {
//		return new Random().nextInt(6) + 1;
		return (int) (Math.random() * 6 + 1);
	}
}
