import java.util.ArrayList;
import java.util.Scanner;
class mygenerics<T1,T2>{
int val;
private T1 t1;
private T2 t2;
mygenerics(int val,T1 t1,T2 t2){
this.val = val;
this.t1 = t1;
this.t2 =  t2;
}
public T2 gett2(){
    return t2;
}
public void sett2(T2 t2){
    this.t2=t2;
}
public int getval(){
    return val;
}
public void setval(int val){
    this.val = val;
}
public T1 gett1(){
    return t1;
}
public void sett1(T1 t1){
    this.t1=t1;
}
}
public class cwh110_generics {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(19);
        a.add("hello");
        a.add(new Scanner(System.in));
        a.add(567);
        int c =(int)a.get(0);
        System.out.println(c);

        mygenerics<String,Integer> g = new mygenerics(19, "I'm just a chill girl",78);
        Integer i = g.gett2();
        String str = g.gett1();
        System.out.println(str);
        //System.out.println(i);
       
        
    }
    
}
