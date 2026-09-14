import java.util.HashSet;

public class longestsubstring {
  public static void main(String[] args) {
    String s="abcabcbb";
   HashSet<Integer>h=new HashSet<>();
   for(int i=0;i<s.length();i++){
    h.add((int) s.charAt(i));
   }
    System.out.println(h.size()); 
  }
}
