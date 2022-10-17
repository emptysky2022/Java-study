package sec08;

public class CompFriend extends Friend {
	private String department;

	public CompFriend(String name, String department, String phone) {
		super(name, phone);
		this.department = department;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
		System.out.println();
	}
}
