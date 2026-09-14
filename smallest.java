

import java.util.*;
public class smallest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int largest =a[0];
        int smallest=a[n-1];
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
