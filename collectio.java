import java.util.*;
public class collectio {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(90);
        l.add(23);
        l.add(13);
      Collections.sort(l);
      System.out.println(l);
      Collections.sort(l,Collections.reverseOrder());
      System.out.println(l);
    }
}
