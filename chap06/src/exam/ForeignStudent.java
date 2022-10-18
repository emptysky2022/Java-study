package exam;

public class ForeignStudent extends Student {
	private String foreign;

	public ForeignStudent(String name, int age, int grade, String foreign) {
		super(name, age, grade);
		this.foreign = foreign;
	}

	public String getForeign() {
		return foreign;
	}

	@Override
	public void show() {
		System.out.println(
				"외국학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + getGrade() + ", 국적 : " + foreign + "]");
	}
}
