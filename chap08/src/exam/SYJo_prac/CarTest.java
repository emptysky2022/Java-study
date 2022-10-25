package exam.SYJo_prac;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");
		if (myCar.equals(yourCar)) {
			System.out.println("자동차 모델이 둘 다 [" + yourCar + "]로 동일하다.");
			Object[] carInfo = { new SimpleDateFormat("MM-dd-yyyy").format(new Date()), myCar, "홍길동" };
			String mf = MessageFormat.format("날짜: {0}, 자동차 모델=[{1}], 운전자({2})", carInfo);
			StringTokenizer st = new StringTokenizer(mf, " ,=[]()");
			while (st.hasMoreTokens())
				System.out.println(st.nextToken());
		} else
			System.out.println("내 자동차는 [" + myCar + "], 너 자동차는 [" + yourCar + "]로 모델이 다르다.");

	}
}
