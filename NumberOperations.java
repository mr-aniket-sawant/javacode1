import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the addition number
        double addition = (num1+num2+num3);

        // Display the sum of the all number
        System.out.println("Sum of the all numbers: " + addition);

        scanner.close();
    }
}

