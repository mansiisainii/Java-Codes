import java.util.HashSet;
import java.util.Iterator;
public class hashset {
  public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    set.add(2);
    set.add(5);
    set.add(1);
    set.add(4);
    set.add(2);
    set.remove(2);
    System.out.println(set.contains(4));
    Iterator it=set.iterator();
    while(it.hasNext()){
      System.out.print(it.next()+" ");
    }
  }
}
