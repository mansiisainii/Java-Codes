
import java.util.Scanner;

public class linear_search {
    public static int linearSearch(int a[],int n,int e){
        for(int i=0;i<n;i++){
            if(a[i]==e){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int e=sc.nextInt();
        sc.close();
        int f=linearSearch(a, n, e);
        if(f!=-1){
            System.out.println("element found at index "+f);
        }
        else{
            System.out.println("element not found");
        }
    }
}
