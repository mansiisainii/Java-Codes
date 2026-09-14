public class sorting {
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {4,6,3,12,5};
        /*for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            printArray(a);*/
            /*for(int i=0;i<a.length-1;i++){
                int min = i;
                for(int j=i+1;j<a.length;j++){
                    if(a[j]<a[min]){
                        min = j;
                    }
                }
                int tem = a[min];
                a[min] = a[i];
                a[i] = tem;

            }
            printArray(a);*/
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

