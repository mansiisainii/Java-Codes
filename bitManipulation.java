

import java.util.Scanner;

public class bitManipulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the position: ");
        int pos=sc.nextInt();
        sc.close();
        int bitmask= 1<<pos;

        //Get bit
        /*if((n & bitmask)==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }*/

        //Set bit
    //    int newno= bitmask | n;
    //    System.out.println(newno);

    //Clear bit
    /*int notbit = ~(bitmask);
    int newnum = notbit & n;
    System.out.println(newnum);*/

    //Update bit
    System.out.println("select between 0 or 1: ");
    int opr=sc.nextInt();
    if(opr==1){
        int newnumber = bitmask |n;
        System.out.println(newnumber);
    }
    else{
        int notbit= ~(bitmask);
        int newnumber = notbit & n;
        System.out.println(newnumber);
    }
    }
}