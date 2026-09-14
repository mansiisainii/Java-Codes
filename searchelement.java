
import java.util.*;
public class searchelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        sc.close();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x==a[i][j]){
                    System.out.println("element found at index "+"("+i+","+j+")");
                }
            }
        }
    }
}
