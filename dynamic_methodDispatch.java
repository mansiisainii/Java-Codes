class phone{
    public void ShowTime(){
        System.out.println("the time is 11:42pm..");
    }
    public void on(){
        System.out.println("turning on the Phone..");
    }
}
class Smartphone extends phone{
    public void music(){
        System.out.println("play the music..");
    }
    public void on(){
        System.out.println("turning on the Smartphone..");
    }
}
public class dynamic_methodDispatch {
    public static void main(String[] args) {
        phone obj = new phone();  //allowed
        obj.on();
        obj.ShowTime();
        Smartphone sobj = new Smartphone(); //allowed
        sobj.on();
        sobj.music();
    }
}

    