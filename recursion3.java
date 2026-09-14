public class recursion3 {
    public static void printPermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
     for(int i=0;i<str.length();i++){
        char currchar=str.charAt(i);
        String newStr=str.substring(0, i)+str.substring(i+1);
        printPermutation(newStr, permutation+currchar);
     }   
    }
    public static int countPaths(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        //move downwards
        int downpaths=countPaths(i+1, j, n, m);
        //move right
        int rightpaths=countPaths(i, j+1, n, m);
        return downpaths+rightpaths;
    }
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //when we place vertically
        int vertplacements=placeTiles(n-m, m);
        //horizontally
        int horPlacements=placeTiles(n-1,m);
        return vertplacements+horPlacements;
    }
    public static void main(String[] args) {
        // String str="abc";
        // printPermutation(str, "");
        // int n=3,m=3;
        // int totalpaths=countPaths(0, 0, n, m);
        // System.out.println(totalpaths);
        int n=4,m=2;
      int t= placeTiles(n, m);
      System.out.println(t);
    }
    
}
