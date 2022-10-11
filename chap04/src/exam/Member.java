package exam;

class Member {
	public String name;
	public String id;
	public String password;
	public int age;

	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getid() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

}
