import java.util.Scanner;

public class mergeSort {
    public static void conquer(int a[],int l,int h,int mid){
        int merged[]=new int[h-l+1];
        int idx1=l;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=h){
            if(a[idx1]<=a[idx2]){
                merged[x]=a[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x]=a[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid){
            merged[x]=a[idx1];
            x++;
            idx1++;
        }
        while(idx2<=h){
            merged[x]=a[idx2];
            x++;
            idx2++;
        }
        //copy merged
        for(int i=0;i<merged.length;i++){
            a[l+i]=merged[i];
        }
    }
    public static void divide(int a[],int l,int h){
        if(l>=h){
            return;
        }
        int mid=l+(h-l)/2;
        divide(a,l,mid);
        divide(a, mid+1, h);
        conquer(a,l,h,mid);
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
        divide(a, 0, n-1);
        System.out.println("After Sorting\n");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
