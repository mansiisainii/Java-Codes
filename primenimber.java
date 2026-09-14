import java.util.Scanner;

public class primenimber {
    public static void main(String[] args) {
        //int count =0;
        try(Scanner sc = new Scanner(System.in)){
        /*int n=sc.nextInt();
        for(int i=1;i<=n;i++){
         if(n%i==0){
            count++;
         }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }*/
         int count;
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 =sc.nextInt();
        for(int i=n1;i<=n2;i++){
            count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count ==2){
                System.out.println(i);
            }
        }

    }
}
}
