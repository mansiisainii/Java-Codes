class Myemployee{
   private int id;
   private String name;
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
public class chapter9 {
    public static void main(String[] args) {
        Myemployee mansi = new Myemployee();
      //  mansi.id = 23;
        //mansi.name = "mansi";            ->throws an error due to private access modifier
       mansi.setid(23);
       mansi.setname("Mansi");
       System.out.println("my name is "+mansi.getname());
       System.out.println("my id is " + mansi.getid());
    }
    
}
