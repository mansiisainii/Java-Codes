import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "i am tostring()";
    }
    public String getMessage(){
        return "i am getmessage()";
    }
}
public class exceptionclsss {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
            throw new MyException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
        }
    }
    }
}
