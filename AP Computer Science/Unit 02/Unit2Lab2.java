package unit2lab2;
import java.util.Scanner;
/**
 * This program prompts the user to enter a monetary amount and then displays the 
 * monetary equivalent in dollars, quarters, dimes, nickels, and pennies
 * @author Marie
 * 
 */
public class Unit2Lab2 {

    public static void main(String[] args) {
        
        int number_dollar, number_quater, number_dime, number_nickle, number_penny, remainding_cents, user_input_in_cents;
        
      
        //get users input
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter monerary amount in dollars and cents as a decimal number:");
        double user_input = scan.nextDouble();
        
        number_dollar = (int) user_input;
        user_input_in_cents = (int) (user_input * 100);
        
        remainding_cents = user_input_in_cents % 100;
        
        number_quater = remainding_cents / 25;
        remainding_cents = remainding_cents % 25;
        
        number_dime = remainding_cents / 10;
        remainding_cents = remainding_cents % 10;
        
        number_nickle = remainding_cents / 5;
        remainding_cents = remainding_cents % 5;
        
        
        number_penny = remainding_cents;
       
        //display the output
        System.out.println("$" + user_input + " consists of " + number_dollar + " dollars, " + number_quater + " quaters, " 
        + number_dime + " dimes, " + number_nickle + " nickles, " + number_penny + " pennies.");
       
    }
    
}
