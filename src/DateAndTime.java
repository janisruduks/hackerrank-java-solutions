import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static String findDay(int month, int day, int year){
        Date specificDate = (new GregorianCalendar (year, month - 1 , day)).getTime(); // hahahaha zero based so january is 0...
        Format dayFormat = new SimpleDateFormat("EEEE");
        return dayFormat.format(specificDate).toUpperCase();
    }
}
