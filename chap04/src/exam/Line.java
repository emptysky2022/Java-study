package exam;

class Line {
	int length;

	Line(int length) {
		this.length = length;
	}

	public boolean isSameLine(Line l) {
		if (this.length == l.length)
			return true;
		return false;
	}

}
