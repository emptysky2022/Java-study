package sec03.nullTest;

import java.util.Optional;

public class NullPointerCaseStudy2 {
	public static void main(String[] args) {
		Continfo ci = new Continfo("010-123-4567", "Republic of Korea");
		Company cp = new Company("YaHo Co., Ltd", ci);
		Friend frn = new Friend("Lee SU", cp);
		showCompAddr(Optional.of(frn));

	}

	public static void showCompAddr(Optional<Friend> frn) {
		String addr = frn.map(Friend::getCmp).map(Company::getCInfo).map(Continfo::getAdrs).orElse("주소가 없어요.");
		System.out.println(addr);
	}
}
