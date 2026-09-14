class Sample{
    Sample(){
        System.out.println("this is a constructor");
    }
}
 interface A{
    public Sample run();
 }
public class nonstatic {
    public static void main(String[] args) {
   A a = Sample::new;
   a.run();
    }
}
