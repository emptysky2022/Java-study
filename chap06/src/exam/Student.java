package exam;

public class Student extends Person {
	private int grade;

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public void show() {
		System.out.println("학생[이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + grade + "]");
	}
}
