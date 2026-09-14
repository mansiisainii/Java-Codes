import java.util.Scanner;

public class errorques {
    public static void main(String[] args) {
        int marks[]= {34,35,57};
            Scanner sc = new Scanner(System.in);
        
        int i=0;
        boolean flag=true;
        while(flag && i<5){
            int idx=sc.nextInt();
            try{
                System.out.println("value is:"+marks[idx]);
                break;
            }
            catch(Exception e){
                System.out.println("invalid index");
                i++;
            }
        }
            if(i>=5){
                System.out.println("error");
            
        }

    }
}
