import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        int futureAge = age + 5;

        System.out.println("Hello " + name + "! In five years, you will be "
                + futureAge + " years old.");

        sc.close();
    }
}