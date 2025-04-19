public class SimpleLoops {
	public static void main(String[] args) {

		for (int x = 0, y = 2, z[] = {1, 2, 3};
			x < 3;
			x++, y--, System.out.println()) {
			System.out.printf("x: %1$d, y: %2$d, z[%2$d]: %3$d",
			x, y, z[y]);
		}

		for (;;) {
			System.out.println("while(true)");
		}

	}
}

class nothing {

	private static void whatIsHappening() {
		int x = 0;
		while (x < 10)
			System.out.println(x);
			x++;
		System.out.println("done");
	}
	
}