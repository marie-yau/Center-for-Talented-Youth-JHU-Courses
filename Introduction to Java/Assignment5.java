package assignment5;
import java.util.Scanner;
/**
 *
 * @author Marie
 * This program prompts the user to enter the weight of a package and then displays the shipping cost.
 */
public class Assignment5 {

    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
         
        // This prompts user to enter the weight of a package.
        System.out.println("Please, enter weight of package in pounds.");
        double weight =sc.nextDouble();
        
        // This decides about the cost of shipping based on weight.
        if (0 < weight && weight <= 1){
            System.out.println("Your package weight " + weight + " pounds. Shipping costs  $ 3.50.");
        }
        else if (1 < weight && weight <= 3){
            System.out.println("Your package weight " + weight + " pounds. Shipping costs  $ 5.50.");
        }
        else if (3 < weight && weight <= 10){
            System.out.println("Your package weight " + weight + " pounds. Shipping costs  $ 9.50.");
        }
        else if (10 < weight && weight <= 20){
            System.out.println("Your package weight " + weight + " pounds. Shipping costs  $ 13.50.");
        }
        else if (weight > 20){
            System.out.println("Package is too heavy to be shipped.");
        }
        else {
            System.out.println("You entered invalid data.");
        }
    }
    
}
