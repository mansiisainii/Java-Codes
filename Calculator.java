import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;

        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                break;
            case 2: // Subtraction
                result = num1 - num2;
                break;
            case 3: // Multiplication
                result = num1 * num2;
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
                valid = false;
        }
        
        if (valid) {
            System.out.println("The result is: " + result);
        }
        
        System.out.println("Thank you for using the Calculator!");
        scanner.close();
    }
}
