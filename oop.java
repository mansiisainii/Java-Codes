interface A{
    void msg();
}
interface B{
    void msg1();
}
class hello implements A,B{
    public void msg(){
        System.out.println("hello");
    }
    public void msg1(){
        System.out.println("goodbye");
    }
}
public class oop
 {
    public static void main(String []args){
        // details d=new details();
        // d.setid(89);
        // System.out.println(d.getid());//wrapping code methods and data variables into a single unit class by making private data types to
        // //hide details and ve can access them through getters and setters
        hello h =new hello();
        h.msg();
        h.msg1();
    }
    
}
