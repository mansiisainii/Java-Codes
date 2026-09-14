import java.io.FileWriter;
import java.io.IOException;

class mydeprecated{
    @Deprecated
    void meth1(){
        System.out.println("method 1");
    }
}
interface myint{
    void display();
}
public class cwh112_Practiceset {
    public static void main(String[] args) {
        //ques 2
      /* mydeprecated d = new mydeprecated();
       d.meth1();
       //ques 2
       myint i = ()->{
        System.out.println("display");
       };
       i.display();*/

       //ques 5
       int i=5;
       String table = "";
       for(int j=0;j<10;j++){
      table+= i+ "X" + (j+1)+ "="+ i*(j+1);
      table+="\n";
       }
       try{
       FileWriter f = new FileWriter("multiplicationtable.txt");
        f.write(table);
        f.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
