public class Name {
	Name() {	// No-argument constructor
		System.out.println("Contructor");
	}

	void Name() {	// Instance method
		System.out.println("Method");
	}

	public static void main(String[] args) {
		new Name().Name();		// Constructor call followed by method call
	}
}