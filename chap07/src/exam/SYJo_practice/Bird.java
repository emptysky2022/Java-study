package exam.SYJo_practice;

public class Bird extends Countable {

	public Bird(String name, int num) {
		super(name, num);
	}

	@Override
	public void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}

	public void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}

}
