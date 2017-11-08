/**
 * 
 * @author Marie Dohnalová
 * This program creates a SavingsAccount object and a CheckingAccount object, 
 * and makes at two deposits and withdrawals from each account.
 */
public class AccountTest {
	public static void main(String[] args){
            
                // create CheckingAccount object
		Account check = new CheckingAccount(2343243, 100.0, .1, new Date(30, 4, 1998), -100.0);
                // create SavingsAccount object
		Account save = new SavingsAccount(65743, 53.0, .2, new Date(30, 4, 1998));
		
		System.out.println("Checking account");
                System.out.println("Balance: " + check.getBalance());
                // make deposits
		check.deposit(10);
		System.out.println("Balance: " + check.getBalance());
		check.deposit(230.5);
		System.out.println("Balance: " + check.getBalance());
                // make withdraws
		check.withdraw(350);
		System.out.println("Balance: " + check.getBalance());
		check.withdraw(200);
		System.out.println("Balance: " + check.getBalance());
		
		System.out.println();
		
		System.out.println("Savings account");
		System.out.println("Balance: " + save.getBalance());
                // make deposits 
		save.deposit(20);
		System.out.println("Balance: " + save.getBalance());
		save.deposit(139.5);
		System.out.println("Balance: " + save.getBalance());
                // make withdraws
		save.withdraw(100.5);
		System.out.println("Balance: " + save.getBalance());
		save.withdraw(200);
		System.out.println("Balance: " + save.getBalance());
	}
}