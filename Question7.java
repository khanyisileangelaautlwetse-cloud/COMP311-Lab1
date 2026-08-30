import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.println(celsius + " degrees Celsius is "
                + fahrenheit + " degrees Fahrenheit.");

        sc.close();
    }
}