import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a no: ");
            int n = sc.nextInt();
            int arm =0;
            int rem;
            int count =0;
            int m =n;
            while(m!=0){
                m=m/10;
                count++;
            }
            m =n;
            while(m!=0){
                rem=m %10;
                arm = arm+(int)Math.pow(rem, count);
                m=m/10;
            }
            if(n==arm){
                System.out.println("arm");
            }
            else{
                System.out.println("not arm");
            }
        }
    }
}
