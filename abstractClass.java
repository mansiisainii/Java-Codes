abstract class parent2{
    public parent2(){
        System.out.println("i'm a constructor of parent2 class");
    }
    public void sayhello(){
        System.out.println("hello");
    }
   abstract public void greet();
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good evening");
    }
}
abstract class child3 extends parent2{
public void tellajoke(){
    System.out.println("i'm perfect");
}
}
public class abstractClass {
    public static void main(String[] args) {
        //parent2 p = new parent2(); - shows error bcz it is an abstract class
        child2 c = new child2();
        c.greet();
       // child3 cd = new child3();- shows error bcz it is an abstract class
        
    }
    
}
