package sakhile;

public class GermanShepherd extends Dog {
	public GermanShepherd(String name, int size, int weight, int teeth) {
		super(name, size, weight, 2, teeth, "silky");
	}

	public void bark() {
		System.out.println("woof woof woof!");
	}

}