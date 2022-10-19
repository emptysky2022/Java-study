package sec03;

public class Notebook extends Computer implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("가방에 넣은 노트북입니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끕니다.");
	}

	@Override
	public void repair() {
		System.out.println("노트북을 수리한다.");
	}
}
