import java.util.*;

public class cwh91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(12);
        l2.add(34);
        l2.add(10);
        l1.add(3);
        l1.add(6);
        l1.add(5);
        l1.add(3);
        l1.add(0,8);
        l1.add(0,5);
        l1.addAll(l2);
        System.out.println(l1.contains(1));
        System.out.println("the index of element 3 : "+l1.indexOf(3));
        System.out.println("the index of last element 3 : "+l1.lastIndexOf(3));
        l1.set(5, 89);
        System.out.println(l1.subList(0, 4));
        System.out.println(l1.retainAll(l2));
        // l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
    }
    
}
}