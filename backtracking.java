public class backtracking {
    public static void  printPermutation(String str,int idx,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            printPermutation(newString, idx+1, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPermutation(str, 0, "");
    }
}
