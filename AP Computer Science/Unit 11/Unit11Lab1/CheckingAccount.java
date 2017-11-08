
public class CheckingAccount extends Account{
	
	private double limit;
        // constructor
	public CheckingAccount (int number, double balance, double interest, Date created, double limit) {
		super(number, balance, interest, created);
		this.setLimit(limit);
	}
	
        @Override
	public void withdraw(double amount){
                // check on overdraw limit
		if(getBalance() - amount < limit)
			System.out.println("Cannot overdraw more than the overdraft limit.");
		else
			super.withdraw(amount);
	}
        
        // getters and setters
	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
}
