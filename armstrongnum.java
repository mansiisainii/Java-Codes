import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        int m=n;
        while(n>0){
            int ld=n%10;
            sum= sum + (ld*ld*ld);
            n=n/10;
        }
        if(sum==m){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
    
}
