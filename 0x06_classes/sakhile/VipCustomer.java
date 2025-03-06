package sakhile;

public class VipCustomer {
	//Fields
	private String name;
	private double creditLimit;
	private String email;

	/* Constructors */
	public VipCustomer() {
		this("Luke", 736274.56, "luke@deathstar.xyz");
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	// Getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getCreditLimit() {
		return this.creditLimit;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}


}