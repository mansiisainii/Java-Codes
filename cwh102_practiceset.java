import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh102_practiceset {
    public static void main(String[] args) {
        //ques 1
        ArrayList a= new ArrayList<>();
        a.add("Student 1");
        a.add("Student 2");
        a.add("Student 3");
        a.add("Student 4");
        a.add("Student 5");
        a.add("Student 6");
        a.add("Student 7");
        for(Object o : a){
            System.out.println(o);
            //ques 5
            HashSet<Integer> h = new HashSet<>();
            h.add(4);
            h.add(4);
            h.add(9);
            h.add(1);
            System.out.println(h);
        }
            //ques 2
            Date d = new Date();
            System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        //ques 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        //ques 4
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String mydate = dt.format(df);
        System.out.println(mydate);

    }
}
