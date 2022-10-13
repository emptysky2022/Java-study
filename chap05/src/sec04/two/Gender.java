package sec04.two;

public enum Gender {
	// Gender.MALE => MALE("남성") => this("남성")?
	MALE("남성"), FEMALE("여성"), OTHERS(1);

	private String s;

	private Gender(String s) {
		this.s = s;
	}

	private Gender(int i) {
		this.s = String.valueOf(i);
	}

	public String toString() {
		return s;
	}

}
