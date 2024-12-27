import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome");
        System.out.println("Enter Number: ");
        String num = sc.next();

        String reverse = new StringBuilder(num).reverse().toString();
        if (num.equals(reverse)) {
            System.out.println(num + " is palindrome.");
        } else {
            System.out.println(num + " is not palindrome.");
        }
    }
}
