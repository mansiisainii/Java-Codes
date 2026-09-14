public class recursion2 {
    public static void towerOfHanoi(int n,String src,String helper,String dest){  //src-source, help -helper , dest - destination
    if(n==1){
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        return;
    }
    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    towerOfHanoi(n-1, helper, src, dest);
    }
    public static void printRevOfStr(String str,int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        printRevOfStr(str, i-1);
    }
    public static int first =-1;
    public static int last =-1;
    public static void findOccurence(String str,int i,char element){
        if(i==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        int currchar = str.charAt(i);
        if(currchar==element){
            if(first==-1){
                first = i;
            }
            else{
                last =i;
            }
        }
        findOccurence(str, i+1, element);
    }
    public static boolean isSorted(int arr[],int i){
         if(i==arr.length-1){
            return true;
         }
        if(arr[i]<arr[i+1]){
            //array is sorted
           return isSorted(arr, i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        /*int n=3;
        towerOfHanoi(n, "Source", "helper","destination");*/
        /*String str = "abcd";
        printRevOfStr(str, str.length()-1);     //O(n) 
        */
        /*String str = "aakjdikdwmnakahafkfieufhakjkanbdcueha";
        findOccurence(str, 0, 'j');*/
        int arr[] = {1,2,4,6};
       System.out.println(isSorted(arr, 0)); 
    }
    
}
