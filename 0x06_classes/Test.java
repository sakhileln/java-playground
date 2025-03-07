import sakhile.Account;
import sakhile.VipCustomer;
import sakhile.Dog;
import sakhile.GermanShepherd;

public class Test {
	public static void main(String[] args) {
		Account acc3 = new Account(76352, 11134.1, "Zethe", "zethe@apple.com", "0791416987");
		System.out.println(acc3.getBalance());

		Account acc5 = new Account();	
		System.out.println(acc5.getName());

		Account acc8 = new Account("sakhi@apple.com", "234-654-888");
		System.out.println(acc8.getBalance());


		VipCustomer cust1 = new VipCustomer();
		System.out.println(cust1.getName());
		System.out.println(cust1.getEmail());
		


		Dog dog1 = new Dog("bobby", 8, 25, 2, 16, "long silky");
		System.out.println(dog1.getName());
		System.out.println(dog1.getCoat());
		dog1.eat();
		dog1.move();

		GermanShepherd germanShep = new GermanShepherd("Basco", 4, 16, 21);
		germanShep.bark();

	}
}