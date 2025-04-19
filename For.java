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


		// What happens?
		labelBlock: for (int i = 0; i < 3; i++) {
			System.out.println(i++);
			++i;
		}


		outer: for(var x = 0; x < 5; System.out.println(), x++) {
			for (var y = 0; y < 5; y++) {
				if (y == x) continue outer;
				System.out.printf("x=%d, y=%d :", x, y);
			}
		}



		skip: {
			if (Math.random() > 0.5) break skip;
			System.out.println("that was a small number");
		}
		System.out.println("finished");


	}
}