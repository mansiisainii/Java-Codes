import java.util.Scanner;

class Solution {
    public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[i];
        }
        for(int i=k;i<n;i++){
            nums[i-k]= nums[i];
        }
        for(int i=n-k;i<n;i++){
            nums[i]=temp[i-(n-k)];
        }

    }
}
public class leftrotate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        Solution s=new Solution();
        s.rotateArray(nums, 2);
        System.out.println("array after rotation:");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
}