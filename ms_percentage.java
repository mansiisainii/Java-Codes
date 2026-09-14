import java.util.*;
public class ms_percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter marks of a:");
        float a = input.nextFloat();
        System.out.println("enter marks of b:");
        float b = input.nextFloat(); 
        System.out.println("enter marks of c:");
        float c = input.nextFloat(); 
        System.out.println("enter marks of d:");
        float d = input.nextFloat();
        System.out.println("enter marks of e:");
        float e = input.nextFloat();
        float total = a + b+ +c+d+ e;
        float percentage = (total * 100) /500;
        System.out.println("the percentage of the marks of 5 subjects is");
        System.out.println(percentage); 
   }
}
