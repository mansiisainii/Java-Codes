import java.util.Scanner;

public class functions_questions {
    public static void calculateAverage(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println(avg);
    }
    static void calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    static int returnGreater(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static double calculateRadius(int r){
        return 2*Math.PI*r;
    }
    static void calPow(int x,int n){
        double res= Math.pow(x, n);
        System.out.println(res);
    }
    static int calculateGcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
            if(a==0){
                return b;
            }
            else{
                return a;
            }
        }
        return -1;
    }
    static void printFib(int n){
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c);
        }
    }
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
   //int x=sc.nextInt();
   int n=sc.nextInt();
//     int r=sc.nextInt();
    sc.close();
   // calculateAverage(a, b, c);
  // calculateSum(n);
//   int res=returnGreater(a, b);
//   System.out.println(res);
// double res=calculateRadius(r);
// System.out.println(res);
//calPow(x, n);
// int res=calculateGcd(x, n);
// System.out.println(res);
printFib(n);
 }   
}
