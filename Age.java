import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		int yearOfBirth;
		while(true) {
			System.out.print("Year of birth: ");
			boolean isNumber = scannerObj.hasNextInt();
			if (isNumber) {
				yearOfBirth = scannerObj.nextInt();
				break;
			} else {
				System.out.println("Invalid input");
			}

			scannerObj.nextLine(); // Handle next line (enter key)
		}

		System.out.println(yearOfBirth);
		scannerObj.close();
	}
}