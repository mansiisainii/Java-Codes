public class recursion1 {
    public static void printNum(int n){
        // 1) printno from from 5 to 1
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
        //2) print no 1 to 5
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+= i;
            System.out.println(sum);
            return;
        }
        sum = sum +i;
        printSum(i+1, n, sum);
    }
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
       int fact_nminus1 =  calcfactorial(n-1);
       int factorial = n* fact_nminus1;
       return factorial;
    }
    public static void printFibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }
    public static int calcPow(int x,int n){
        if(n==0){
            return 1;  //case 1 :- x^0 = 1
        }
        if(x==0){
            return 0; //case 2:- 0^n =0
        }
        int xpownm1 = calcPow(x, n-1);  //xpownm1 = x pwer(n-1)
        int xpown = x*xpownm1;    //x^n
        return xpown;
    }
    public static int calcpoww(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){        //when power is EVEN
            return calcpoww(x, n/2)*calcpoww(x, n/2);
        }
        else{
            return calcpoww(x, n/2)*calcpoww(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        //int n =5;
        //int n =1;
        //printNum(n);
        //printSum(1, 5, 0);
       /*int fac= calcfactorial(5);
       System.out.println(fac);*/
       /*int a =0,b=1;
       System.out.println(a);
       System.out.println(b);
       int n =7;
       printFibonacci(a, b, n-2);*/
       /*int ans =calcPow(2, 05);
       System.out.println(ans);*/
       int answer = calcpoww(5, 4);
       System.out.println(answer);
    }
}
