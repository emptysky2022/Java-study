package sec03.nullTest;

public class Friend {
	String name;
	Company cmp;

	public Friend(String name, Company cmp) {
		this.name = name;
		this.cmp = cmp;
	}

	public String getName() {
		return name;
	}

	public Company getCmp() {
		return cmp;
	}

}
