package sakhile;

public class Account {
	
	// Fields
	private int accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	// Constructor
	public Account() {
		this(123456789, 1.5, "skywalker-default", "skywalker@deathstar.xyz", "888-782-244");
		System.out.println("Empty constructor was called");
	}

	public Account(int accountNumber, double balance, String name, String email, String phoneNumber) {
		System.out.println("Constructor with parameters was called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	// Methods
	public void depositFunds(double funds) {
		System.out.println("Depositing... R" + funds);
		this.balance += funds;
	}
	public void withdrawFunds(double funds) {
		if ((funds < this.balance) && ((this.balance - funds) > 0)) {
			System.out.println("Withdrawing: R" + funds);
			this.balance -= funds;
		} else {
			System.out.println("Insufficient funds.");
		}
	}

	// Getters and setters
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
}