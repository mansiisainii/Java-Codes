import java.util.HashSet;

public class cwh95_hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6,0.5f);
        hs.add(6);
        hs.add(5);
        hs.add(5);
        hs.add(9);
      System.out.println(hs.clone());
      System.out.println(hs.isEmpty());
System.out.println(hs.contains(0));
        System.out.println(hs);
    }
    
}
