package sec03.nullTest;

public class Company {
	private String cName;
	Continfo cInfo;

	public Company(String cName, Continfo cInfo) {
		this.cName = cName;
		this.cInfo = cInfo;
	}

	public String getCName() {
		return cName;
	}

	public Continfo getCInfo() {
		return cInfo;
	}
}
