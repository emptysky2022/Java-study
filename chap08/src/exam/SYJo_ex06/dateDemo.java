package exam.SYJo_ex06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 M월의 dd번째 날");
		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 yyyy년의 DDD번째 날");
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));

	}
}
