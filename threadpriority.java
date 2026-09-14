class Mythread extends Thread{
    Mythread(String name){
        super(name);
    }
    public void run(){
        int i=90;
        while(true){
            System.out.println("my name is :"+this.getName());
            i++;
        }
    }
}
public class threadpriority {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("mansi1");
         Mythread t2 = new Mythread("mansi2");
          Mythread t3= new Mythread("mansi3");
           Mythread t4 = new Mythread("mansi4");
            Mythread t5 = new Mythread("mansi5  (important thread)");
            t5.setPriority(Thread.MAX_PRIORITY);
            t1.setPriority(Thread.MIN_PRIORITY);
          t1.start();
           t2.start();
            t3.start();
             t4.start();
              t5.start();
    }

}
