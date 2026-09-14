import java.util.LinkedList;

public class questionll {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(5);
        l.add(7);
        l.add(3);
        l.add(8);
        l.add(2);
        l.add(3);
        for(int i=0;i<l.size();i++){
            if(l.get(i)==7){
                System.out.println(i);
            }
        }
    }
}
