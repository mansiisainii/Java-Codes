import java.util.Scanner;

public class checkarrayissorted {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    System.out.println("after sorting: ");
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
 }   
}
