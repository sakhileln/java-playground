public class Sample {
	public static void use(Runnable runnable) {
		runnable.run();
	}

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("You called ...");
			}
		};

		use(runnable);
	}
}