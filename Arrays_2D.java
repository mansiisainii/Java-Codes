import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {
        /*try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the no of rows:");
            int rows = sc.nextInt();
            System.out.println("Enter the no of columns:");
            int column = sc.nextInt();
            int arr[][]= new int[rows][column];
            //input
            //rows
            System.out.println("Enter array elements:");
            for(int i=0;i<rows;i++){
                //columns
                for(int j=0;j<column;j++){
                    arr[i][j] = sc.nextInt();
                   
                }
            }
            //output
            System.out.println("The output is:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<column;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
         
        //search x
        System.out.println("Enter element to be searched:");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j]==x){
                    System.out.println("Element is found at index: "+i+","+j);
                }
            }
        }
        }*/
        //  TRANSPOSE OF A MATRIX
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int arr[][] = new int[rows][columns];
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            //Transpose
            System.out.println("the transpose of the matrix is:");
            for(int j=0;j<columns;j++){
                for(int i=0;i<rows;i++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
            catch(ArrayIndexOutOfBoundsException e){
             e.printStackTrace();
            }
        
    }
}
