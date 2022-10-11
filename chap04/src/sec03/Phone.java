package sec03;

class Phone {
	private String model;
	int value;

	void print() {
		System.out.println(value + "만 원짜리 " + model + " 스마트폰");
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
