
public class recursion {
    //factorial(0) = 1;
    // factorial(n) = n*(n-1)*(n-2)------1
    // factorial(n) = n*factorial(n-1)
    //static int factorial(int n){
    static int factorial_iterative(int n){
        if(n==0 || n==1){
        return 1;    
        }
        //else{
//    return n * factorial(n-1); }
      else{
        int product = 1;
        for(int i =1;i<=n;i++){
            product*=i;
        }
        return product;
      }
        
    }
    public static void main(String[] args) {
        int a = 6;
     //   System.out.println("the factorial of a is"+factorial(a));
     System.out.println("the factorial of a is: "+factorial_iterative(a));
        
    }
}
