import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        System.out.print("Enter a single word: ");
        String word = sc.next();

        System.out.println("You entered " + number + ", " + decimal
                + ", and the word \"" + word + "\".");

        sc.close();
    }
}