package Chapter08;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
  public static void main(String[] args) {
    Date now =new Date();
    System.out.println(now);

    Calendar c =Calendar.getInstance(); // abstract class이기에 new로 생성 불가
    System.out.println(c);

//    System.out.printf("오늘은 %d년 %d월 %d일입니다.",
//        c.get(Calendar.YEAR),
//        c.get(Calendar.MONTH)+1),
//        c.get(Calendar.DAY_OF_MONTH)
//    );
    Calendar c1 = Calendar.getInstance();
    System.out.println(c.compareTo(c1));


    System.out.println(c.get(Calendar.DAY_OF_MONTH));
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    System.out.println(c.get(Calendar.WEEK_OF_YEAR));
  }
}
