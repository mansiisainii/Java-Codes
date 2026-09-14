class Mythread1 extends Thread{
    public void run(){
        int i =0;
        while(i<1000){
        System.out.println("my thread  1 is running");
        System.out.println("I'm happy");
        i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i =0;
        while(i<1000){
        System.out.println("my thread 2 is running");
        System.out.println("I'm sad");
        i++;
        }
    }
}
public class cwh_70threads {
    public static void main(String[] args) {
        
        Mythread1 t = new Mythread1();
        Mythread2 m = new Mythread2();
        t.start();
        m.start();
    }
    
}
