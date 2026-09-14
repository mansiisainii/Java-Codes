import java.util.Scanner;

public class printdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(" "+i);
        //     }
        // }


        //for O(sqrt(n)) time complexity
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
            if((n/i)!=i){
                System.out.print((n/i)+" ");
            }
        }
    }
    }
}
