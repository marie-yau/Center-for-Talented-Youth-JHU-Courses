package assignment10;

/**
 *
 * @author Marie Dohnalová
 * This program creates two Account objects, 
 * one that is created with only an owner’s name and one that is created with an owner’s name
 * and an opening deposit amount.
 * Program makes two deposits and two withdrawals from each account.
 */
public class Assignment10 {

    public static void main(String[] args) {
        
        // Create object with name
        Account FirstAccount = new Account ("John Smith");
        // Create object with name and initial deposit
        Account SecondAccount = new Account ("Jane Smith", 100);
        
        // Display account names and initial account balances
        System.out.println("Account balances");
        System.out.println(FirstAccount.getAccountName() + ": " + FirstAccount.getCurrentBalance());
        System.out.println(SecondAccount.getAccountName() + ": " + SecondAccount.getCurrentBalance());
        
        System.out.println();
        
        // Make first deposits and display account balances
        System.out.println("Account balances after first deposit");
        FirstAccount.MakeDeposit(10.5);
        System.out.println(FirstAccount.getAccountName() + ": " + FirstAccount.getCurrentBalance());
        SecondAccount.MakeDeposit(30);
        System.out.println(SecondAccount.getAccountName() + ": " + SecondAccount.getCurrentBalance());
        
        System.out.println();
        
        // Make second deposits and display account balances
        System.out.println("Account balances after second deposit");
        FirstAccount.MakeDeposit(50);
        System.out.println(FirstAccount.getAccountName() + ": "+  + FirstAccount.getCurrentBalance());
        SecondAccount.MakeDeposit(25);
        System.out.println(SecondAccount.getAccountName() + ": " + SecondAccount.getCurrentBalance());      
        
        System.out.println();
        
        // Make first withdrawals and display account balances
        System.out.println("Account balances after first withdrawal");
        FirstAccount.MakeWithdraw(15);
        System.out.println(FirstAccount.getAccountName() + ": " + FirstAccount.getCurrentBalance());
        SecondAccount.MakeWithdraw(40);
        System.out.println(SecondAccount.getAccountName() + ": " + SecondAccount.getCurrentBalance());       
        
        System.out.println();
        
        // Make second withdrawals and display account balances
        System.out.println("Account balances after second withdrawal");
        FirstAccount.MakeWithdraw(100);
        System.out.println(FirstAccount.getAccountName() + ": " + FirstAccount.getCurrentBalance());
        SecondAccount.MakeWithdraw(10);
        System.out.println(SecondAccount.getAccountName() + ": " + SecondAccount.getCurrentBalance());  
    }
    
}
