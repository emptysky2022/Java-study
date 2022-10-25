package exam.SYJo_ex02;

public class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("학생[%s]", name);
	}
}
