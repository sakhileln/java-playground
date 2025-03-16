public class Lambda {
	public static void use(Runnable runnable) {
		runnable.run();
	}

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("You called ...");

		use(runnable);
	}
}