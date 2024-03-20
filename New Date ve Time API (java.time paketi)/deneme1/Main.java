import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /*
        Calendar c = Calendar.getInstance();
        c.set(1974, Calendar.JANUARY, 2, 8, 31, 27);
        Date d = c.getTime();
        System.out.println(d);
         */

        /*
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy"); //pattern is specified here
        System.out.println(dateFormat.format(today));
        dateFormat.applyPattern("dd-MM-yyyy");
        System.out.println(dateFormat.format(today));
        dateFormat.applyPattern("dd-MM-yyyy HH:mm:ss E");
        System.out.println(dateFormat.format(today));
        */
        /*
        LocalTime time = LocalTime.now();
        System.out.println(time);//Saat dakika saniye ve küsürat
        time = LocalTime.MIDNIGHT;//Gece Yarısı
        System.out.println(time);
        time = LocalTime.NOON;// Öğle vakti 12
        System.out.println(time);
        time = LocalTime.of(12, 12, 45);// Hour: 12 Minute: 12 Second: 45
        System.out.println(time);
        */

        /*
        LocalTime lTime = LocalTime.now();
        Instant instant = lTime.atDate(LocalDate.of(A_YEAR, A_MONTH, A_DAY)).
                atZone(ZoneId.systemDefault()).toInstant();
        Date time = Date.from(instant);
        System.out.println(time);
         */
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        String dateStr = "02/25/2016"; // input String
        try {
            Date date = dateFormat.parse(dateStr);
            System.out.println(date.getYear() + 1900); // Düzeltme: Yılın tam değerini almak için 1900 ekleyin
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
