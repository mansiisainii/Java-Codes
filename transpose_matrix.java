
import java.util.Scanner;
public class transpose_matrix {
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
        sc.close();
        System.out.println("transpose of the matrix is: ");
        // for(int j=0;j<cols;j++){
        //     for(int i=0;i<rows;i++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
    } 
}
