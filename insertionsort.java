public class insertionsort {
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {2,1,8,3,9,4,10,5};
        for(int i=1;i<a.length;i++){
            int current =i;
            int j=i-1;
            while(j>=0 && current <a[j]){
                a[j+1] =a[j];
                j--;
            }
            a[j+1] = current;
        }
        printArray(a);
    }
}
