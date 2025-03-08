package sakhile;

public class GermanShepherd extends Dog {
	private String bites;

	/* Constructor */
	public GermanShepherd(String name, int size, int weight, int teeth) {
		super(name, size, weight, 2, teeth, "silky");
	}
	/* Methods */
	public void bark() {
		System.out.println("woof woof woof!");
	}

}