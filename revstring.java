public class revstring {
    public static void revString(String str,int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.println(str.charAt(i));
        revString(str, i-1);
    }
    public static int first =-1;
    public static int last =-1;
    public static void findOccur(String str,int i,char element){
        if(i==str.length()){
            System.out.println(first);
            System.out.println(last);
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
       findOccur(str, i+1, element); 
    }
    public static void main(String[] args) {
     String str = "abcd";
     revString(str, str.length()-1);
    }
}
