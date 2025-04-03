import java.util.Scanner;

public class test {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String someText = """
						Is
						this
						allowed
						in
						Java?""";

		switch(Integer.parseInt(scanner.nextLine())) {
			case 1 -> System.out.println("you called...");
			case 2 -> System.out.println(someText);
			default -> System.out.println("default case...");
		}
	}
}