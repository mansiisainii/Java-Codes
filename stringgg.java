import java.util.HashSet;

public class stringgg {
    //reverse string
    public static void printrev(String str,int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printrev(str, index-1);
    }
    //first and last occurence
    public static int first=-1;
    public static int last=-1;
    public static void findOuc(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
       char currentchar=str.charAt(idx);
       if(currentchar==element){
        if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }
       }
       findOuc(str, idx+1, element);
    }
    //check array is sorted(strictly increasing)
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    //move all x to end of string
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currentchar=str.charAt(idx);
        if(currentchar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString+=currentchar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static boolean[] map=new boolean[26];//because we have 26 alphabets
    public static void removeDuplicates(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentchar=str.charAt(idx);
        if(map[currentchar-'a']==true){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString+=currentchar;
            map[currentchar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        } 
        char currchar=str.charAt(idx) ;
        //to be
        subsequences(str, idx+1, newString+currchar);
        //or not to be
        subsequences(str, idx+1, newString);

      }
      public static void uniqueSubsequences(String str,int idx,String newString,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar=str.charAt(idx);
        uniqueSubsequences(str, idx+1, newString+currchar,set);
        uniqueSubsequences(str, idx+1, newString,set);
      }
    public static void main(String[] args) {
    //    String str="MAnsi"; 
    //    printrev(str, str.length()-1);
    // String str="abaacdaefaah";
    // findOuc(str, 0, 'a');
    // int arr[]={1,3,5,7,9};
    // System.out.println(isSorted(arr, 0));
    // String str ="abxkfjxxxic";
    // moveAllX(str, 0, 0,"");
    // String str="aabbcddkkaeed";
    // removeDuplicates(str, 0, "");
    // String str = "abc";
    // subsequences(str, 0, "");
    String str="aaa";
    HashSet<String>set=new HashSet<>();
    uniqueSubsequences(str, 0, "",set);
    }
    
}
