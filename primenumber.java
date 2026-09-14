import java.util.Scanner;

public class primenumber {
    //this is for O(sqrt(n)) time complexity
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        sc.close();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                if((n/i)!=i){
                c++;
            }
            } 
        }
        if(c==2){
                System.out.println("prime");
            }
            else{
               System.out.println("not prime");
            }
    }
}
