import java.util.Scanner;

public class towerOfH{
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println(("Transfer disk "+n+" from "+src+" to "+dest));
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println(("Transfer disk "+n+" from "+src+" to "+dest));
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        towerOfHanoi(n, "S", "H", "D");
    }
    }

