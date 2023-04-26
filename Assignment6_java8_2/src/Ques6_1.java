package Assignment6_java8_2.src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ques6_1 {
    public static void main(String[] args) {
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("DD-MM-YY");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Delhi"));
        String a = dateFormat.format(today);
        System.out.println(a);

        dateFormat.setTimeZone(TimeZone.getTimeZone("France/London"));
        String b = dateFormat.format(today);
        System.out.println(b);

        dateFormat.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
        String c = dateFormat.format(today);
        System.out.println(c);
    }
}
