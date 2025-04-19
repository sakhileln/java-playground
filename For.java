import java.util.List;

public class For {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i++);
		}

		List<String> names = List.of("Katie", "Moise", "Mpho", "Sihle");
		for (String n : names) {
			if ("Mpho".equals(n)) break;
			System.out.println(n);
		}

	}
}