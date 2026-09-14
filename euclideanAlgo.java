import java.util.Scanner;

public class euclideanAlgo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int a=sc.nextInt();
        System.out.println("enter n2");
        int b=sc.nextInt();
        sc.close();
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println("The gcd is: "+b);
        }
        else{
            System.out.println("The gcd is: "+a);
        }
    }
}
