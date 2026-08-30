import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Length: " + sentence.length());
        System.out.println("Upper case: " + sentence.toUpperCase());
        System.out.println("Lower case: " + sentence.toLowerCase());
        System.out.println("Contains \"Java\": " + sentence.contains("Java"));

        sc.close();
    }
}