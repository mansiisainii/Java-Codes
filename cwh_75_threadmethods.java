class Mynewthr1 extends Thread{
    public void run(){
     // int i=0;
     //  while(i<678){
     while(true){
        System.out.println("Hello");
     //   i++;
     try {
        Thread.sleep(455);
     } catch (Exception e) {
       e.printStackTrace();

}
       } 
    }
}
class Mynewthr2 extends Thread{
    public void run(){
       int i=0;
       while(i<100){
        System.out.println("Goodbye");
        i++;
       } 
    }
}
public class cwh_75_threadmethods {
    public static void main(String[] args) {
        Mynewthr1 t1 = new Mynewthr1();
        Mynewthr2 t2 = new Mynewthr2();
        t1.start();
        /*try {
           t1.join(); 
        } catch (Exception e) {
            System.out.println(e);
           

        }*/
        t2.start();
        
    }
}
