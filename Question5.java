import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}