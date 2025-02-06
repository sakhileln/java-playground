import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond (odd number): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a symmetric diamond.");
            return;
        }

        int spaces = n / 2, stars = 1;

        // Upper part of the diamond
        for (int i = 0; i <= n / 2; i++) {
            printChars(' ', spaces);
            printChars('*', stars);
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower part of the diamond
        spaces = 1;
        stars = n - 2;
        for (int i = n / 2 + 1; i < n; i++) {
            printChars(' ', spaces);
            printChars('*', stars);
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }

    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
}
