import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date date = new Date();
        date.setHours(date.getHours() + 8);
        System.out.println(date);
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("kk:mm:ss");
        System.out.println(simpDate.format(date));
    }
}
