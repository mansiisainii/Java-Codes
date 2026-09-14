class mymainemployee{
    private int id;
    private String name;
    public mymainemployee(){
         id = 01;
         name = "24 hours depressed with no academic comeback, Hey this is mansi";
    }
    public mymainemployee(String myname,int i){
        name = myname;
        id = i;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        id = i;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }

}
public class constructors {
    public static void main(String[]args){
        mymainemployee mansi = new mymainemployee("how ghar ki chotti beti who is 24 hours depressed with no academic comeback looks like..."
                        ,78);
        //mansi.setid(34);
        System.out.println(mansi.getid());
        //mansi.setname("24 hours depressed with no academic comeback,\n Hey this is mansi");
        System.out.println(mansi.getname());

    }
    
}
