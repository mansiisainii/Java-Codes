interface Sampleclass{
    void meth1();
    void meth2();
}
interface childsampleclass extends Sampleclass{
void meth3();
void meth4();
}
class MySampleClass implements childsampleclass{
    public void meth1(){
        System.out.println("\n");
        System.out.println("It's Okay to make mistakes...");
        
    }
    public void meth2(){
        System.out.println("It's Okay to take a break...");
       
    }
    
    public void meth3(){
        System.out.println("Set back is not failure...");
      
    }
    
    public void meth4(){
        System.out.println("Small steps are also progress...");
        System.out.println("\n");
    }
}
    
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass s = new MySampleClass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
   }  
}
