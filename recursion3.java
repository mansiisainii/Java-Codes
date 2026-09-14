
import java.util.ArrayList;

public class recursion3 {
    public static void printPerm(String str, String Permutation) {
        if (str.length() == 0) {
            System.out.println(Permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPerm(newString, Permutation + currChar);
        }
    }

    public static int countPaths(int i, int j, int n, int m) {
        if (i >= n || j >= m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downpaths
        int downpaths = countPaths(i + 1, j, n, m);
        // move rightpaths
        int rightpaths = countPaths(i, j + 1, n, m);
        return downpaths + rightpaths;
    }
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertical
        int verPlacements=placeTiles(n-m, m);
        //horizontal
        int horPlacements=placeTiles(n-1, m);
        return verPlacements+horPlacements;
    }
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        //single
        int way1=callGuests(n-1);
        //pair
        int way2= (n-1)*callGuests(n-2);
        return way1+way2;
    }
    public static void printSubset(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer>subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubset(n-1,subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        // String s="abc";

        // printPerm(s, "");

        // int n = 3, m = 3;
        // System.out.println(countPaths(0, 0, n, m));

        // int n=4,m=2;
        // System.out.println(placeTiles(n, m));

        int n=4;
        // System.out.println(callGuests(n));

        ArrayList<Integer> subset=new ArrayList<>();
        findSubset(n, subset);
    }
}