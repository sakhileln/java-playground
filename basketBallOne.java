import java.util.Scanner;


public class basketBallOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		System.out.println(input.charAt(input.length() - 2));

		sc.close();
	}
}