class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<20){
            System.out.println("hello "+ this.getName());
            i++;
        }
    }
}
public class cwh_74_threadPriorities {
    public static void main(String[] args) {
      Mythr1 t1 = new Mythr1("Mansi");
      Mythr1 t2 = new Mythr1("Mona");
      Mythr1 t3 = new Mythr1("Khushi");
      Mythr1 t4 = new Mythr1("Aayushi");
      t1.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.NORM_PRIORITY);
      t4.setPriority(Thread.MIN_PRIORITY);
      t1.start();
      t2.start();
      t3.start();
      t4.start();    
    }
    
}
