import java.util.Scanner;

public class conditions{
    public static void main(String[] args) {
       // System.out.println("enter your age");
       try(Scanner sc = new Scanner(System.in)){
       // int a = sc.nextInt();
        /*int age = sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
        if(no%2==0){
            System.out.println("even");
        }
        else{
        System.out.println("odd");        }
        int b = sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }
       else{
        if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("b is greater");
        }
       }
      int b = sc.nextInt();
      if(a==b){
        System.out.println("equal");
      }
      else if(a>b){
        System.out.println("a is greater");
      }
      else{
        System.out.println("b is greater");
      }*/
        int button = sc.nextInt();
        switch(button){
            case 1: 
            button=1;
            System.out.println("hello");
            break;
            case 2:
            button=2;
            System.out.println("namaste");
            break;
            case 3:
            button=3;
            System.out.println("bonjour");
            break;
            default:
            System.out.println("invaid input");
        }
    }
}
}