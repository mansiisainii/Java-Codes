public class xkipowern {
    public static int calPow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //if n is even like 4 = 2^1 * 2^1
        if(n%2==0){
            int halfpow = calPow(x, n/2);
            return halfpow*halfpow;
        }
        //if n is odd like 5 = 2* 2^4
        else{
            return x* calPow(x, n-1);
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int res=calPow(x, n);
        System.out.println(res);
    }
}
