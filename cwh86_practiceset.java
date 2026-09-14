import java.util.Scanner;

public class cwh86_practiceset {
    public static void main(String[] args) {
        // problem 1
      //  int a=4 //syntax error
      /*int age =78;
      int year_born = 2000-78;     //logical error beacuse 2000 me se current age minus krne ka koi tuk nahi h curent year se krni thi
      System.out.println(year_born); 
      System.out.println(6/0); //runtime */

      //pirablam 2
      /*try{
        int a = 666/0;
        System.out.println(a);
      }
      catch(ArithmeticException e){
           System.out.println("hahahahha");
      }
      catch(IllegalArgumentException e){
        System.out.println("hehehehe");
      }*/

      //problem 3
      boolean flag = true;
      int marks[] = new int[3];
      marks[0] = 56;
      marks[1] = 78;
      marks[2] = 67;
      Scanner sc = new Scanner(System.in);
      int index;
      int i =0;
      while(flag && i<5){
        try{
            System.out.println("enter the value of index:");
      index = sc.nextInt();
      System.out.println("the value of marks[] is:"+marks[index]);
      break;
      }
      catch(Exception e){
        System.out.println("Invalid index");
        i++;
      }
      }
      if(i>=5){
        System.out.println("Error");
      }
    }
    
}
