public class BankTester {
   	public static void main(String[] args) {
		BankAccount alex = new BankAccount("Alex", 100.00);
		BankAccount jamie = new BankAccount("Jamie", 250.00);


	alex.deposit(50.00);


	alex.printInfo();
	jamie.printInfo();
	}
}

class BankAccount {
   private String owner;
   private double balance;
 
   public BankAccount(String o, double b) {
      owner = o;
      balance = b;
   }
 
   public void deposit(double amount) {
      balance = balance + amount;
   }
 
   public void printInfo() {
      System.out.println(owner + " — Balance: $" + balance);
   }
}
