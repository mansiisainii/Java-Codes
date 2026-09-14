import java.util.Scanner;

public class arrays {
    //for optimal
    static int secondLargest(int a[],int n){
        int largest=a[0];
        int slargest=Integer.MIN_VALUE;//we can also take -1 if array doesnt contain negative no
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest=a[i];
            }
        }
        return slargest;
    }
    static int secondSmallest(int a[],int n){
        int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest && a[i]<ssmallest){
                ssmallest=a[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
       int n/*(size)*/=sc.nextInt();
       int a[]= new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       sc.close();

       //PRINT LARGEST ELEMENT IN ARRAY
    //    int largest=a[0];
    //    for(int i=0;i<n;i++){
    //     if(largest<a[i]){
    //         largest=a[i];
    //     }
    //    }
    //     System.out.println(largest);

    //PRINT SECOND LARGEST ELEMENT IN ARRAY
    /*BRUTE 
    //at first we have to sort the array
    int largest=a[n-1];
    for(int i=n-2;i>=0;i--){
        if(a[i]!=largest){
            int sec_largest=a[i];
        }
    } and that's why by t.c becomes O(n+nlogn)*/

    /*Better 
    int largest=a[0];
    int sec_largest=-1;
    for(int i=0;i<n;i++){
        if(largest<a[i]){
            int t=largest;
            largest=a[i];
            sec_largest=t;
        }
    } this is not A COMPLETE code, but its T.C is O(2n)*/

    //OPTIMAL
    System.out.println("The second largest no is "+secondLargest(a, n));
    System.out.println("The second smallest no is "+secondSmallest(a, n));
    }
}
