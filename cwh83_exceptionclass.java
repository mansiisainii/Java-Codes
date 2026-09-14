import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I'm toString";
    }
    @Override
    public String getMessage(){
        return"I'm getMessage";    }
}
public class cwh83_exceptionclass {
   
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        if(a<7){
            try{
            //throw new MyException();
            throw new ArithmeticException("this is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }
        
    }
    
}
