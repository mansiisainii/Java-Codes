
import java.util.ArrayList;
import java.util.Scanner;

public class binary_search {
    static int binarySearch(ArrayList<Integer>li,int e,int l,int h){
    while(l<=h){
        int mid=l+(h-1)/2;
        if(e==li.get(mid)){
            return mid;
        }
        else if(e>li.get(mid)){
            return binarySearch(li, e, mid+1, h);
        }
        else{
            return binarySearch(li, e, l, mid-1);
        }
    }
    return -1;
   }
   public static void main(String[] args) {
    ArrayList<Integer>li=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n=sc.nextInt();
    System.out.println("Enter array elements: ");
    for(int i=0;i<n;i++){
        li.add(sc.nextInt());
    }
    System.out.println("enter element to be searched:");
    int e=sc.nextInt();
    sc.close();
    int f=binarySearch(li, e, 0, n-1);
    if(f!=-1){
        System.out.println("element found at index:"+f);
    }
    else{
        System.out.println("element not found");
    }
   }
   }

// import java.util.*;

// public class binary_search {
//     static int binarySearch(ArrayList<Integer> list, int l, int h, int e) {
//         if (l <= h) {
//             int mid = l + (h - l) / 2;  // safer midpoint

//             if (list.get(mid) == e) {
//                 return mid;
//             } else if (e > list.get(mid)) {
//                 return binarySearch(list, mid + 1, h, e);
//             } else {
//                 return binarySearch(list, l, mid - 1, e);
//             }
//         }
//         return -1; // not found
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size of array: ");
//         int n = sc.nextInt();

//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.println("Enter array elements (sorted): ");
//         for (int i = 0; i < n; i++) {
//             list.add(sc.nextInt());
//         }

//         System.out.println("Enter element to be searched: ");
//         int e = sc.nextInt();
//         sc.close();

//         int f = binarySearch(list, 0, n - 1, e);

//         if (f != -1) {
//             System.out.println("Element found at index: " + f);
//         } else {
//             System.out.println("Element not found");
//         }
//     }
// }
