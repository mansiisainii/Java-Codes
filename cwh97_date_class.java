import java.util.Date;

public class cwh97_date_class {
    public static void main(String[] args) {
       // System.out.println(Long.MAX_VALUE);
        //System.out.println(System.currentTimeMillis());
        //Date d = new Date(24+1900,12,23,2,6,2);    depricated constructor
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
    }
    
}
