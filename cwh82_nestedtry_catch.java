import java.util.Scanner;

public class cwh82_nestedtry_catch {
    public static void main(String[] args) {
      int  marks[] = new int[3];
      marks[0] = 90;
      marks[1] = 67;
      marks[2] = 77;
       Scanner sc = new Scanner(System.in);
       boolean flag = true;
       while(flag){
       System.out.println("enter value of index:");
       int index = sc.nextInt();
       try{
        System.out.println("welcome to video no 82");
        try {
            System.out.println(marks[index]);
            flag = false;
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("SOrry this index doesn't exist");
           System.out.println("exception in level2");
        }
       }
       catch(Exception e){
        System.out.println("exception in level 2");
       }
       }
       System.out.println("thanks for using this program!");
}
}