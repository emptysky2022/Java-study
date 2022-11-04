package exam.prac;

import exam.prac.PracMain.Gender;

public class Member {
	String name;
	Gender gender;
	int age;

	public Member(String name, Gender gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Member(" + name + ", " + gender + ", " + age + ")";
	}

}
