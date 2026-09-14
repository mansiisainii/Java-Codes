interface A{
    default void show(){
        System.out.println("showing");
    }
    static void print(){
        System.out.println("print");
    }
    void run();
}
class B implements A{
    public void run(){
        System.out.println("running");
    }
}
public class defaultandstatic {
    public static void main(String[] args) {
        
    
    B b = new B();
    b.show();
    b.run();
  
    }
}
