import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a no: ");
        //int n = sc.nextInt();
        /*int rem =0;
        int m =n;
        int rev =0;
        while(m!=0){
            rem = m%10;
            rev = rev*10 +rem;     
            m=m/10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        //fibonacci 
        int a=-1,b=1,c;
     for(int i=0;i<=n;i++){
         c= (a+b);
         System.out.println(c);
         a=b;
         b=c;
     }
     System.out.println();
     //Armstrong:- ex 12=square(1)+sq(2)  , 123=cube(1)+cube(2)+cube(3), 1234=qua(1)+quad(2)..etc
     int arm=0;
     int count =0;
     int rem;
     int m =n;
     while(m!=0){  //this loop is used to check the count of no for ex:- 153 has 3 numbers 
        m = m/10;
        count++;
     }
     m=n;   //again store m to n
     while(m!=0){
        rem = m%10;
        arm = arm + (int)Math.pow(rem,count); //count is the power of given rem  // here int is used b/c math.pow takes a double value
        m=m/10;
     }
     if(n==arm){
        System.out.println("armstrong");
     }
     else{
      System.out.println("not arm");
     }*/
    //prime no
    System.out.println("enter the value of n1: ");
    int n1=sc.nextInt();
    System.out.println("enter the value of n2: ");
    int n2 = sc.nextInt();
    int count;
    for(int i=n1;i<=n2;i++){  //here we have to find prime no b/w range n1 and n2 where n1,n2 are also included so firstof all if we suspect a given 
        count =0;             //no like 7 then we have to set count to 0 because when i++ then 8 has many factors so count will never be equal to 2
        for(int j=1;j<=i;j++){ //this loop is used to put the condition to check a no
        if(i%j==0){
            count++;
        }
    }
        if(count==2){
            System.out.println(i);
        }
        
    }

    }
}
}
