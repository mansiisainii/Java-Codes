class mansi extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class mansi1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Welcome");
            i++;
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class cwh76_threadPracticeset {
    public static void main(String[] args) {
        mansi m = new mansi();
        mansi1 ms = new mansi1();
         // m.setPriority(6);
         //ms.setPriority(9);
        //System.out.println("the priority of m is "+m.getPriority());
        //System.out.println("the priority of ms is "+ms.getPriority());
        System.out.println("the state of ms is "+ms.getState());
        System.out.println("the state of m is "+m.getState());
        System.out.println("the state of ms is "+Thread.currentThread().getState());
       // m.start();
       //ms.start();
        
    }
    
}
