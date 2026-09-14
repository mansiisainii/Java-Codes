interface A{
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
    void meth4();
}
class C implements B{
    public void meth1(){
        System.out.println("meth1 ");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class inheritanceininterface {
    public static void main(String[] args) {
        C c = new C();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}
