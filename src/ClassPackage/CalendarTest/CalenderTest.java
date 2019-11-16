package ClassPackage.CalendarTest;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName CalenderTest
 * @Description: 使用类的接口解决复杂任务，而不必知道其中的实现细节
 * @Authot li
 * @Date 2019/11/7
 * @Version v1.0
 **/

public class CalenderTest {

    public static void main(String[] args){
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH,1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);

        int firstDayOfWeek = d.getFirstDayOfWeek();

        int indent = 0;

        while (weekday != firstDayOfWeek){
            indent++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s",weekdayNames[weekday]);

        }
        while (weekday != firstDayOfWeek);
        System.out.println();

        for (int i = 1;i <= indent;i++)
            System.out.print("         ");

        d.set(Calendar.DAY_OF_MONTH,1);
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);

            if (day == today) System.out.printf("*");
            else System.out.printf(" ");

            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_MONTH);

            if (weekday == firstDayOfWeek) System.out.println();
        }
        while (d.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek) System.out.println();


    }
}
