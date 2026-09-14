interface Mycamera{
    void takesnap();
    void recordvideo();     
    private void introduce(){                                            //it is a private type
        System.out.println("hello! this is your Smartphone");
    }
   default void record4kvideo(){
    introduce();
    System.out.println("recording 4k videos");      //this method can also be override in smartphone class
    }
}
interface Mywifi{
 String[] getnetworks();
 void connecttonetworks(String network);
}
class Mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling to"+phonenumber);
    }
    void Receivecall(){
        System.out.println("call received...");
    }
}
 class Mysmartphone extends Mycellphone implements Mycamera,Mywifi{
    public void takesnap(){
        System.out.println("to take  snap...");
    }
    public void recordvideo(){
        System.out.println("recording video...");
    }
    public String[] getnetworks(){
        System.out.println("Getting list of networks...");
        String[] networklist = {"rechargekarao","wifi123","decode"};
        return networklist;
    }
    public void connecttonetworks(String network){
        System.out.println("connected to "+ network);
    }
}
public class default_methods {
    public static void main(String[] args) {
        Mysmartphone s = new Mysmartphone();
        s.record4kvideo();
        String[] nl = s.getnetworks();
        for(String item:nl){
            System.out.println(item);
        }
        s.connecttonetworks("decode");
        s.takesnap();


        
        
    }
    
}
