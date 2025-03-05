package sakhile;

public class Main {
  
  public static void main(String[] args) {

    Account acc1 = new Account(236534, 23.5, "Sakhile", "sakhi@example.com", "0825812435");

    System.out.println("Current balance: R" + acc1.getBalance());
    acc1.depositFunds(10.7);
    acc1.withdrawFunds(50.1);
    acc1.withdrawFunds(4.1);
    System.out.println("Current balance: R" + acc1.getBalance());
    System.out.println(acc1.getName() + " email: " + acc1.getEmail() + " Current balance is: R" + acc1.getBalance());
    System.out.println(acc1.toString());
  }

}
