package sec03;

public class BoxFault1 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();

		aBox.setOb(new Apple());
		bBox.setOb(new Orange());

		aBox.setOb("apple");
		aBox.setOb("orange");

		Apple ap = (Apple) aBox.getOb();
		Orange og = (Orange) bBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}
}
