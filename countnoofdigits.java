import java.util.Scanner;

public class countnoofdigits {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int count=0;
    while(n>0){
       // int lastdigit=n%10;
        count=count+1;
        n=n/10;
    }
    System.out.println(count);
   } 
}
