package sec02;

public class Mammal extends Animal {
	public Mammal() {
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}

	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}