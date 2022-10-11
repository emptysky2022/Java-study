package exam;

public class TrangleTest {
	public static void main(String[] args) {
		Trangle t = new Trangle(10.0, 5.0);

		System.out.println(t.findArea());

		Trangle t1 = new Trangle(10.0, 5.0);
		Trangle t2 = new Trangle(5.0, 10.0);
		Trangle t3 = new Trangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
