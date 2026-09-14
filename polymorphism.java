interface mycamera2{
    void takesnap();
    void record4kvideos();
}
interface mywifi2{
    String[] getnetworks();
    void connecttonetworks(String network);
}
class mycellphone2{
    void  callnumber(int phonenumber){
        System.out.println("calling to"+ phonenumber);
    }
    void receivecall(){
        System.out.println("connecting..");
    }
}
class Mysmartphone2 extends mycellphone2 implements mycamera2,mywifi2{
    public void takesnap(){
        System.out.println("taking snap...");
    }
    public void record4kvideos(){
        System.out.println("recording 4k videos...");
    }
    public String[] getnetworks(){
        System.out.println("getting network list");
        String[] networklist = {"iphone","realme","redmi","samsung"};
        return networklist;
    }
    public void connecttonetworks(String iphone){
        System.out.println("connected to"+ iphone);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        mycamera2 cam = new Mysmartphone2();
        cam.record4kvideos();
        //cam.callnumber(70xx); ---> throws an error because at this time smartphone can only be used as a camera
        Mysmartphone2 p = new Mysmartphone2();
        p.takesnap();
        
    }
    
}
