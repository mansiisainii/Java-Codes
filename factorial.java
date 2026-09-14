import java.util.Scanner;

public class factorial {
   /* public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("invalid input");
        }
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static void calculateFibonacci(int n){
    int a=-1;
   int  b=1;
   int  c=0;
    for(int i=0;i<=n;i++){
     c=a+b;
     System.out.println(c);
     a=b;
     b=c;
    }
}
    public static void palindrome(int n){
        int rem;
        int rev=0;
        int m=n;
        while(m!=0){
            rem = m%10;
            rev = rev*10+rem;
            m=m/10;
        }
        if(rev==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void calculateArmstrong(int n){
        int arm =0;
        int count =0;
        int rem;
        int m =n;
        while(m!=0){
            m=m/10;
            count++;
        }
        m=n;
        while(m<0){
            rem = m%10;
            arm = arm+(int)Math.pow(rem,count);
            m=m/10;
        }
        if(arm==n){
            System.out.println("arm");
        }
        else{
            System.out.println("not arm");
        }
    }*/
    public static void calculatePrime(int n1,int n2){
    int count;
    for(int i=n1;i<=n2;i++){
        count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(i);
        }
    }
    }
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
       // int n = sc.nextInt();
       // calculateFactorial(n);
       //calculateFibonacci(n);
      // palindrome(n);
     // calculateArmstrong(n);
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
    calculatePrime(n1, n2);
    }
   } 
}
