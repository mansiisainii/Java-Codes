import java.util.Scanner;

public class quickSort {
    public static int partition(int a[],int l,int h){
        int pivot=a[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=a[h];
        a[h]= temp;
        return i;
    }
    public static void quickSort(int a[],int l,int h){
        if(l<h){
            int pindex=partition(a,l,h);
            quickSort(a, l, pindex-1);
            quickSort(a, pindex, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        quickSort(a, 0, n-1);
        System.out.println("After Sorting\n");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
