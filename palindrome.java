import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        sc.close();
        int m =n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        if(m==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
