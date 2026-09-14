public class recursion1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void printt(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printt(n+1);
    }
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void printFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static int calPow(int x,int n){
       /* if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownminus1=calPow(x, n-1);
        int output = x*xpownminus1;
        return output;*/

        //optimal approach
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            int halfpower=calPow(x, n/2);
            return halfpower*halfpower;
        }
        else{
            return x*calPow(x, n-1);
        }
    }
    public static void main(String[] args) {
        // int n=5;
        // printNum(n);

        // int n=1;
        // printt(n);

        // printSum(1, 3, 0);

        // int fact = factorial(5);
        // System.out.println(fact);

        // int a=0,b=1;
        // int n=7;
        // System.out.println(a);
        // System.out.println(b);
        // printFib(a, b, n-2);

        int n=5,x=2;
        int result=calPow(x, n);
        System.out.println(result);
    }
}
