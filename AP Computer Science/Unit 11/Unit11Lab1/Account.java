/**
 * 
 * @author Marie Dohnalová
 * This class models a bank account. The Account class has the properties account number,
 * balance, annual interest rate, and date created. 
 * It also has methods to deposit and withdraw funds.
 */
public abstract class Account {
	private int number;
	private double balance;
	private double interest;
	private Date created;
	
        // constructor
	public Account(int number, double balance, double interest, Date created) {
		super();
		this.number = number;
		this.balance = balance;
		this.interest = interest;
		this.created = created;
	}
	
        // make withdraw
	public void withdraw(double amount){
		balance -= amount;
	}
	
        // make deposit
	public void deposit(double amount){
		balance += amount;
	}
        
        // getters and setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
