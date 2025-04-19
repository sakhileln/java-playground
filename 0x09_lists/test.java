public class Test {
	public static void main(String[] args) {
		output("Name", "Surname");
		String[] names = new String[] {"Grade", "WTC_", "Computer"};
		output(names);
	}
	private static void output(String... array) {
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}
}