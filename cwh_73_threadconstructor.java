class Mythr extends Thread{
public Mythr(String name){
    super(name);
}
public void run(){
 // for(int i=0;i<5;i++){
   // System.out.println("I'm a thread");
   //}
   System.out.println("hello");
}
}
public class cwh_73_threadconstructor {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("mansi");
        Mythr t2 = new Mythr("mona");
        t1.start();
        t2.start();
        System.out.println("id of thread 1 is "+t1.getId());
        System.out.println("id of thread 2 is "+t2.getId());
        System.out.println("the name of thread 1 is "+t1.getName());
        System.out.println("the name of thread 2 is "+t2.getName());
    }
    
}
