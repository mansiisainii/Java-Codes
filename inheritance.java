class superclass{
    int x;
    public void setx(int i){
        System.out.println("i'm in superclass and setting x");
        this.x = i;
    }
    public int getx(){
        return x;
    }
    public void me(){
        System.out.println("i'm a constructor");
    }
}
class subclass extends superclass{
    int y;
    public void sety(int i){
        this.y = i;
    }
    public int gety(){
        return y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        superclass s = new superclass();
        s.setx(2);
        System.out.println(s.getx());
        subclass ss = new subclass();
        ss.setx(34);
        System.out.println(ss.getx());
        ss.sety(78);
        System.out.println(ss.gety());
        
    }
    
}
