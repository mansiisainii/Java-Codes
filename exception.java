import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int marks[]={56,58,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index: ");
        int index= sc.nextInt();
        System.out.println("enter the number you want to divide the index with: ");
        int number = sc.nextInt();
        try{
            System.out.println("the value of array index provided is: "+marks[index]);
            System.out.println("the value of array value/number is: "+marks[index]/number);
        }
          catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some exception occured");
            System.out.println(e);
        }
      
    }
}
