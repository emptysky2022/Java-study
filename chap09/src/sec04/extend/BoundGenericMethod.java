package sec04.extend;

public class BoundGenericMethod {
	public static void main(String[] args) {
		Box<Integer> sBox = BoxFactory.makeBox(5959);
		int n = sBox.getOb();
		System.out.println(n);

		Box<Double> dBox = BoxFactory.makeBox(5959.5959);
		Double d = dBox.getOb();
		System.out.println(d);
	}
}
