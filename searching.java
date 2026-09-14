import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        //linear search
        int arr[]= {2,4,3,7,5};
        try(Scanner sc = new Scanner(System.in)){
         System.out.println("enter the element to be searched:");
         int e = sc.nextInt();
         /*for(int i=0;i<arr.length;i++){
            if(e==arr[i]){
             System.out.println("element found at index "+i);
            }
         }*/
        int l=0;
        int h=arr.length -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(e == arr[mid]){                        //fucking ridiculous code
                System.out.println("found");
                break;
            }
            else if(e>arr[mid]){
                l=mid +1;
            }
            else{
                h = mid-1;
            }
      
        }
        }
    }
}
