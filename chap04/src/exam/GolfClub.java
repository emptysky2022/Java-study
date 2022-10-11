package exam;

public class GolfClub {
	private int iron;
	private String putter;

	public GolfClub() {
		this(7);
	}

	public GolfClub(int iron) {
		this.iron = iron;
	}

	public GolfClub(String putter) {
		this.putter = putter;
	}

	public void print() {
		if (putter == null) {
			System.out.println(iron + "번 아이언입니다.");
		} else
			System.out.println("퍼터입니다.");
	}
}
