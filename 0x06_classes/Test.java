import sakhile.Account;

public class Test {
	public static void main(String[] args) {
		Account acc3 = new Account(76352, 11134.1, "Zethe", "zethe@apple.com", "0791416987");
		System.out.println(acc3.getBalance());

		Account acc5 = new Account();	
		System.out.println(acc5.getName());

		Account acc8 = new Account("sakhi@apple.com", "234-654-888");
		System.out.println(acc8.getBalance());

	}
}