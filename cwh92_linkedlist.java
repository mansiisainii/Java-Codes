import java.util.*;

public class cwh92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(23);
        l2.add(90);
        l2.add(89);
        l1.add(3);
        l1.add(4);
        l1.add(8);
        l1.add(5);
        l1.addAll(l2);
        l1.addLast(244);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
    
}
