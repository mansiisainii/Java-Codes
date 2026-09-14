import java.util.Scanner;

public class functions {
    /*public static void printMyName(String name){
       System.out.println(name);
       public static int calculateSum(int a,int b){
        int sum = a+b;
        return sum;
       }
       public static int multiply(int a,int b){
        int mult = a*b;
        return mult;
}     public static void calculateFactorial(int n){
          if(n<1){
            System.out.println("invalid input");
            return;
          }
          int fact =1;
          for(int i=n;i>=1;i--){
            fact*=i;
          }
          System.out.println(fact);
               }
              public static void checkPrimenumber(int n){
              int count =0;
              for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
              }
              if(count==2){
                System.out.println("prime");
              }
              else{
                System.out.println("not prime");
              }
              }
            public static void checkEven(int n){
                for(int i=1;i<=n;i++){
                    if(n%2==0){
                        System.out.println("Even");
                        break;
                    }
                    else{
                        System.out.println("odd");
                        break;
                    }
                }
            }*/
            public static void printTable(int n){
                for(int i=1;i<=10;i++){
                    System.out.printf("%d"+"X"+"%d"+"="+"%d\n",n,i,(n*i));
                }
            }
         
        public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        /*System.out.println("Enter your name");
       // String name = sc.next();
       // printMyName("My name is "+name);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
       //int sum = calculateSum(a, b);
       //System.out.println("the sum of a and b is: "+sum);
      int mul = multiply(a,b);
System.out.println("The multiplication of a and b is: "+mul);
        int n = sc.nextInt();  
       calculateFactorial(n);
       int n=sc.nextInt();
       checkPrimenumber(n);
       int n = sc.nextInt();
       checkEven(n);*/
       int n =sc.nextInt();
       printTable(n);
    }
}
}
//note: functions can be directly called while methods can only be called after creating object
// public is a access modifier and static is a keyword by which we don't need to create an object to call a function by
//using static keyword we can call a function without creating object