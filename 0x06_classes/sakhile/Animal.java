package sakhile;

public class Animal {
	
	// Fields
	private String name;
	private int brain;
	private int size;
	private int weight;

	// Constructor
	public Animal(String name, int brain, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.size = size;
		this.weight = weight;
	}
	
	// Getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}
	public int getBrain() {
		return this.brain;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return this.size;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
}