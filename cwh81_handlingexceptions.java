import java.util.Scanner;

public class cwh81_handlingexceptions {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 45;
        marks[1] = 89;
        marks[2] = 90;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with:");
        int number = sc.nextInt();
        try{
            System.out.println("the value of array index is:"+marks[index]);
            System.out.println("the value of array-value/number is:"+marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception occurs");
            System.out.println(e);
        }
    }
    
}
