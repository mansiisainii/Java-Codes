class Hello{
    static String name="mansi";  //static variable 
    
    
    void show(){
        System.out.println("my name is:"+ name);
    }
}
public class constructorr {
    public static void main(String[] args) {
       Hello h = new Hello();
       h.show();
    }
}
