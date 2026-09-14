@FunctionalInterface
interface myfunctionalinterface{
    void hello();
    
}
class newphone extends phone{
    @Override
    public void ShowTime(){
        System.out.println("time is 10 pm");
    }

    @Deprecated
public int sum(int a,int b){
    return a+b;
}
}
public class cwh108_javaannotations {
    @SuppressWarnings("Deprecation")
    public static void main(String[] args) {
        newphone p = new newphone();
        p.ShowTime();
        p.sum(2, 4);
        
    }
    
}
