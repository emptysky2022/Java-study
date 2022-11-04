package sec03.nullTest;

public class NullPointerCaseStudy {
	public static void main(String[] args) {
		Continfo ci = new Continfo("010-123-4567", "Republic of Korea");
		Company cp = new Company("YaHo Co., Ltd", ci);
		Friend frn = new Friend("Lee SU", cp);
		showCompAddr(frn);

	}

	public static void showCompAddr(Friend frn) {
		String addr = null;

		if (frn != null) {
			Company com = frn.getCmp();
			if (com != null) {
				Continfo info = com.getCInfo();
				if (info != null) {
					addr = info.getAdrs();
				}
			}
		}
		System.out.println(addr != null ? addr : "주소 정보가 없습니다.");
	}
}
