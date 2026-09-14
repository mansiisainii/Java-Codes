 interface bicycle{
    int a =100;
    void  applybrake(int decrement);
    void speedup(int increment);
    void playmusic();
}
interface hornplay{
    void blowhorn1();
    void blowhorn2();
    void tapakgya();
    }

class bike implements bicycle,hornplay{
    void blowhorn(){
        System.out.println("pee pee po po");
    }
    public void applybrake(int decrement){
        System.out.println("applying Brakw");
    }
    public void speedup(int increment){
        System.out.println("INCREASE THE SPEED OF BIKE TO->");
    }
    public void playmusic(){
        System.out.println("ALEXA PLAY MUSIC:-");
    }
    public void blowhorn1(){
        System.out.println("1.)Meri zindagi ch kyu tu aayi yaari kyu ni tune nibhayi,kiti sadde naal bewafayi,sanu de kudiye jawab\ndass de kedi galti,sanu deri ae saja,rovengi menu yaad karke,rovengi mainu yaad karke.....\nbewafa bewafa bewafa nikli hai tu,ni jhuta pyaar jhuta pyaar jhuta pyaar kita haye tu...");
    }
    public void blowhorn2(){
        System.out.println("2.)Aaoge tum kabhi,meri jaan keh rahi;gayega ye sama,gayegi ye zameen\nbadlega ye jahan,gaayega aasma;aaoge tum kabhi,meri jaan keh rahi...");
    }
    public void tapakgya(){
        System.out.println("KHATAM TATA GAYA\nGOODBYE");
    }
    }

public class interfaces{
@SuppressWarnings("static-access")
public static void main(String[] args){
   bike b = new bike();
   //you can create properties in interfaces
    b.speedup(50);
    System.out.println(b.a);
   //you can't modify the properties  in interfaces as they are final
   //b.a = 23; (gives error)
    b.playmusic();
    b.blowhorn1();
    b.blowhorn2();
    b.tapakgya();
    
}    
}