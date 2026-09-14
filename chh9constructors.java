class Myemployee1{
    private int id;
    private String name;
    public  Myemployee1(){
        id = 100;
        name = "percent depressed";
    } 
    public  Myemployee1(String myname,int myid){
        id = myid;
        name = myname;
    }    
    
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
    id = i;
    }
    public int getid(){
        return id;
    }
    }
    
    public class chh9constructors {
        public static void main(String[] args) {
           // Myemployee1 mansi = new Myemployee1("mansi",20);
            Myemployee1 mansi = new Myemployee1();                            //constructor overloading 
           // mansi.setid(100);
           // mansi.setname("percent depressed");
           System.out.println(mansi.getid());
            System.out.println(mansi.getname());
            
        }
        
    }
    
    
