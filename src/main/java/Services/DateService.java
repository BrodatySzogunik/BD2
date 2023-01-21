package Services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateService {
    final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-DD");
    public static String ToString(LocalDate date){
        return dtf.format(date);
    }
}
