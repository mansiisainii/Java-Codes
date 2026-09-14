import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy--E H:m a");
        String mydate = df.format(dt);
        System.out.println(mydate);
       // DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df3 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(df3);
      //  System.out.println(df2);
    }
}
