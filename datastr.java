import java.util.*;
public class datastr {
    public static void main(String[] args) {
        HashMap<Integer,String> h= new HashMap<>();
        h.put(1,"Mansi");
        h.put(2, "noone");
        h.put(3,"else");
        System.out.println(h.get(1));
        System.out.println(h.containsKey(2));
       System.out.println(h.keySet());
    }
}
