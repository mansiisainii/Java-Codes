class runnablethreads1 implements Runnable{
    public void run(){
    for(int i=0;i<500;i++){
        System.out.println("hello");
    }
}
}
class runnablethreads2 implements Runnable{
    public void run(){
    for(int i=0;i<500;i++){
        System.out.println("goodbye");
    }
    }
}
public class cwh71_runnable {
    public static void main(String[] args) {
        runnablethreads1 bullet1 = new runnablethreads1();
        Thread gun1 = new Thread(bullet1);
        runnablethreads2 bullet2 = new runnablethreads2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
        
        
    }
    

}
