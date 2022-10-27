package exam.SYJo_ex01;

import java.util.Calendar;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate() {
        Calendar now = Calendar.getInstance();
        year = now.get(Calendar.YEAR);
        month = now.get(Calendar.MONTH) + 1;
        day = now.get(Calendar.DAY_OF_MONTH);
    }
}
