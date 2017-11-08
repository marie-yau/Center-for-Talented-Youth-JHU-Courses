
public class SavingsAccount extends Account {
        // constructor
	public SavingsAccount(int number, double balance, double interest, Date created) {
		super(number, balance, interest, created);
	}
	
	@Override
	public void withdraw(double amount){
                // check if we didn't overdraw account
		if(getBalance() - amount < 0)
			System.out.println("Cannot overdraw a savings account.");
		else
			super.withdraw(amount);
	}
}
