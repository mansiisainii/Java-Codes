import java.util.Scanner;
public class takingInputFromUser {
    public static void main(String[] args) {
        System.out.println("taking a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);

    }
}
