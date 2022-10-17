package sec08;

public class MyFriends {
	public static void main(String[] args) {
		Friend[] frns = new Friend[10];

		int cnt = 0;

		frns[cnt++] = new UnivFriend("Kim", "컴퓨터공학과", "010-1234-5678");
		frns[cnt++] = new UnivFriend("Lee", "디자인학과", "010-1111-2222");
		frns[cnt++] = new UnivFriend("Park", "전기공학과", "010-3333-4444");
		frns[cnt++] = new UnivFriend("Jo", "물리학과", "010-9999-1234");

		frns[cnt++] = new CompFriend("Jo", "개발부", "02-5555-7777");
		frns[cnt++] = new CompFriend("Kim", "R&D", "02-1111-3210");
		frns[cnt++] = new CompFriend("Park", "영업부", "02-5555-9999");

		int sw = 0;
		for (int i = 0; i < cnt; i++) {
			if (frns[i] instanceof UnivFriend && sw == 0) {
				System.out.println("============= 대학 동창 ============");
				sw++;
			}
			if (frns[i] instanceof CompFriend && sw == 1) {
				System.out.println("============= 회사 동기 ============");
				sw++;
			}
			frns[i].showInfo();
		}

	}
}
