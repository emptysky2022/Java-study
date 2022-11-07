package sec04;

import java.io.Serializable;

public class SBox implements Serializable {
	String s;
	transient String pw;

	public SBox(String s, String pw) {
		this.s = s;
		this.pw = pw;
	}

	public String get() {
		return s + ", " + pw;
	}
}
