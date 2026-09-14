import java.util.Scanner;

public class gcdorhcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int n1=sc.nextInt();
        System.out.println("enter n2");
        int n2=sc.nextInt();
        sc.close();
        int gcd=1;
        // for(int i=1;i<=Math.min(n1,n2);i++){
        //   if(n1%i==0 && n2%i==0){
        //     gcd=i;
        //   }  
        // }
        // System.out.println(gcd);

        for(int i=Math.min(n1,n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
