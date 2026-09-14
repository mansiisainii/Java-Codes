sealed class A permits B,C{
    public void info(){
        System.out.println("I'm human being");
    }
}
final class  B extends A{
    public void info(){
        System.out.println("I'm b");
    }
}
final class C extends A{
    public void info(){
        System.out.println("I'm C");
    }
}
public class sealedclass {
    public static void main(String[] args) {
        A a = new B();
        a.info();
        A a1 = new C();
        a1.info();
    }
}
