// import java.util.ArrayList;
// import java.util.Scanner;
import java.util.*;
public class move_zeroestoendofarray {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
           l.add(sc.nextInt());
        }
        sc.close();
        int j=-1;
        for(int i=0;i<n;i++){
            if(l.get(i)==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
        for(int i=j+1;i<n;i++){
            if(l.get(i)!=0){
            Collections.swap(l,i,j);
            j++;
            }
        }
    }
        System.out.println("result: "+l);
    }
}
