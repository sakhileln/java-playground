/**
 * 
 * Encapsulation (Data Hiding & Protection)
 * 📌 Think of it as a school locker. Only you (or someone with a key)
 * can open it.
 * 🔹 Example: Your bank account has a balance, but only you
 * can check or update it.
 * 
 * 💡 Why is this useful? It protects important data and
 * only allows controlled access.
 */

class BankAccount {
    private int balance = 1000;  // Private data (hidden)

    public int getBalance() {  // Public method to access balance
        return balance;
    }

    public void deposit(int amount) {  // Public method to modify balance
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        System.out.println("New balance: " + myAccount.getBalance());
    }
}
