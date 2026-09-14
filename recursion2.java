import java.util.HashSet;
import java.util.Scanner;

public class recursion2 {
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    
    public static int first=-1;
    public static int last=-1;
    public static void findOccurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println("First element is at index: "+first);
            System.out.println("Last element is at index: "+last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurence(str, idx+1, element);
    }
    public static boolean isSorted(int a[],int idx){
        if(idx==a.length-1){
            return true;
        }
        if(a[idx]<a[idx+1]){
           return isSorted(a, idx+1);
        }
        else{
            return false;
        }
    }
    public static void moveAllx(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
             System.out.println(newString);
                return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllx(str, idx+1, count, newString);
        }
        else{

            newString+=currChar;
            moveAllx(str, idx+1, count, newString);
        }
    }
    public static boolean map[]=new boolean[26];
    public static void removeDuplicate(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str, idx+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicate(str, idx+=1, newString);
        }
    }
    public static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
         char currChar=str.charAt(idx);
        //to be
       
        subsequences(str, idx+1,newString+currChar);
        //or not to be
        subsequences(str, idx+1, newString);
    }
    public static void uniqueSubsequence(String str,int idx,String newString,HashSet<String> s){
        if(idx==str.length()){
            if(s.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                s.add(newString);
                return;
            }
        }
        char currChar= str.charAt(idx);
        uniqueSubsequence(str, idx+1, newString+currChar, s);
        
        uniqueSubsequence(str, idx+1, newString, s);
    }
    public static String keyPad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keyPad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, newString+mapping.charAt(i));
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        // printRev(s, s.length()-1);/

        // findOccurence(s, 0, 'a');

        // int a[]={2,3,4,5,6};
        // System.out.println(isSorted(a,0));

        // moveAllx(s, 0,0,"");

        // removeDuplicate(s, 0, "");

        // subsequences(s, 0, "");

        // HashSet<String>set=new HashSet<>();
        // uniqueSubsequence(s, 0, "", set);

        printComb(s, 0, "");
    }
}
