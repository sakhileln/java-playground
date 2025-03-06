package sakhile;

public class Dog extends Animal {
	// Fields
	private int eyes;
	private int teeth;
	private String coat;
	
	// Constructor
	/*
	public Dog(String name, int brain, int size, int weight) {
		super(name, brain, size, weight);
	}
	*/
	public Dog(String name, int size, int weight, int eyes, int teeth, String coat) {
		super(name, 1, size, weight);
		this.eyes = eyes;
		this.teeth = teeth;
		this.coat = coat;
	}

	// Methods
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void move() {
		System.out.println("Overriden Dog.move() called");
		chew();
		super.move();
	}


	// Getters and setters
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getEyes() {
		return this.eyes;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}
	public int getTeeth() {
		return this.teeth;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}
	public String getCoat() {
		return this.coat;
	}
}