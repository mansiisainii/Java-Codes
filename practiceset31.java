public class practiceset31 {
    static void multiplication(int n){
       for(int i =1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
      System.out.println();
    }
    }
    
    static void pattern2(int n){
        for(int i = n;i>0;i--){
        for(int j =0;j<i;j++){
            System.out.print(" * ");
        }System.out.println("");

        }
    }
    
    //sum(n) = 1 + 2 + 3 + ------
    //sum(n) = 1 + 2 + 3 + --- +  (n-1) + n
    //sum(n) = sum(n-1) + n
    // example:- sum(3) = 3 + sum(2)
              // sum(3) + 3 + 2 + sum(1)
              // sum(3) + 3 + 2 + 1
    static int sumRec(int n){
    if(n==1){
        return 1;
    }
    else{
        return n + sumRec(n-1);
    }
    }

    static int fib(int n){                 //for nth term start from 1 and for index value start from 0
        /*if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }*/
        if(n==1 || n==2){
            return(n-1);
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

     static int average(int...arr){
        int sum = 0;
        int average = 0;
        for(int a:arr){
            sum = sum+a;
            average = sum/arr.length;

        }
        return average;
     }

     static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern2_rec(int n){
    for(int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print(" * ");
        }
    }System.out.println();
    }
   
    public static void main(String[] args) {
        // ques 1 
     // multiplication(25);

                       //ques 2
   // pattern1(4);
                     //ques 3
    // int c = sumRec(4);
    // System.out.println(c);
 
                       // ques 4
                   //    pattern2(4);

                    //ques 5
                    // fibonacci seies :- 0,1,1,2,3,5,8,13,21,34----
   // int result= fib(5);
    //System.out.println(result);
                       
                           // ques 6
         
        // System.out.println("the average of 2,4,6 is:"+ average(2,4,6));

                             //ques 8
                       //  pattern1_rec(3);

                       //ques 7
                       pattern2_rec(6);

                        
    


        
    }
}
