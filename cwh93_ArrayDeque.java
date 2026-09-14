import java.util.ArrayDeque;

public class cwh93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(9);
        ad1.add(5);
        ad1.add(8);
        ad1.addLast(2);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        for(int i=0;i<ad1.size();i++){
            System.out.println(ad1);
        }
        
    }
}
