import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibbonacci series");
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < num; i++) {
            n3 = n1 + n2; // 1
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3; //
        }

    }
}
