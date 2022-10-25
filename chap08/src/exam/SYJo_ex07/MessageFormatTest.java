package exam.SYJo_ex07;

import java.text.MessageFormat;

public class MessageFormatTest {
	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		MessageFormat mf = new MessageFormat("이름 : {0}\t\t번호 : {1}\t\t국적 : {2}");

		for (Object[] o : data) {
			System.out.println(mf.format(o));
		}
	}
}
