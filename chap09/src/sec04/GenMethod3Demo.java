package sec04;

class Ticket implements Comparable {
	int no;

	public Ticket(int no) {
		this.no = no;
	}

	@Override
	public int compareTo(Object o) {
		Ticket t = (Ticket) o;
		return no < t.no ? -1 : (no > t.no ? 1 : 0);
	}

}

public class GenMethod3Demo {
	public static <T extends Comparable, E> int countGT(T[] a, E e) {
		int count = 0;
		for (T t : a)
			if (t.compareTo(e) > 0)
				++count;

		return count;

	}

	public static void main(String[] args) {
		Ticket[] a = { new Ticket(5), new Ticket(3), new Ticket(10), new Ticket(7), new Ticket(4) };

		System.out.println(countGT(a, a[4]));
	}
}
