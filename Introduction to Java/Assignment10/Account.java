package assignment10;

/**
 *
 * @author Marie Dohnalová
 * This class has methods to set/get the owner’s name, to make a deposit, to make 
 * a withdrawal, and to get the current balance.
 */
public class Account {
    
    private String Name;
    private double balance;
    
    // Constructor: object is created with name and initial deposit
    public Account (String name, double InitialDeposit){
        Name = name;
        balance = InitialDeposit;
    }
    
    // Constructor: object is created with name
    public Account (String name){
        Name = name;
        balance = 0;
    }
    
    // Method that sets account name
    public void setAccountName (String name){
        Name = name;
    }
    
    // Method that gets account name
    public String getAccountName (){
        return Name;
    }
    
    // Method that makes withdrawal
    public void MakeWithdraw (double withdraw){
        if (balance - withdraw >= 0)
            balance = balance - withdraw;
        else 
            ErrorMessage();
    }
    
    // Method that makes deposit
    public void MakeDeposit (double deposit){
        balance = balance + deposit;
    }
    
    // Method that gets current balance
    public double getCurrentBalance (){
        return balance;
    }
    
    // Method that displays error message
    private void ErrorMessage(){
        System.out.println(getAccountName()+": The withdrawal is disallowed.");
    }
}
