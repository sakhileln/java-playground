import java.util.Scanner;

/**
 * Your friend Bob is really bad at adding numbers, and he’d like some
 * help to make sure he’s doing it correctly! Can you help Bob make 
 * sure he is adding correctly? Given 3 integers A, B, C, make sure A+B=C
 * that and that Bob indeed added and correctly.
 */


public class addingtrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = sc.nextLong();
        if ((a+b) == ans) System.out.println("correct!");
        else if ((a+b) != ans) System.out.println("wrong!");
        sc.close();
    }
}
