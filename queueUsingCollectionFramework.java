import java.util.LinkedList;
import java.util.Queue;

public class queueUsingCollectionFramework {
  public static void main(String[] args) {
    Queue<Integer> q= new LinkedList<>();
    q.add(1);
    q.add(23);
    q.add(3);
    q.add(4);while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
   }
  }
}
