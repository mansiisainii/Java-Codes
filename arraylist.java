import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(10);
        al.add(5);
        al.add(9);
        System.out.println(al);
        int e=al.get(3);
        System.out.println(e);
        al.remove(3);
        System.out.println(al);
        al.add(3,56);
        System.out.println(al);
        al.set(0,1);
        System.out.println(al);
        System.out.println(al.size());
        Collections.sort(al);
        System.out.println(al);
        int x=al.get(2);
        System.out.println(x);
        System.out.println(al.contains(3));
        System.out.println(al.isEmpty());
        //loops
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }
}
