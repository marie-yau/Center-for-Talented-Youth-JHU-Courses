package assignment7b;
import java.util.Scanner;
/**
 *
 * @author Marie
 * This program calculates and displays amount in the account after n years.
 */
public class Assignment7B {
    
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        
        // Get P.
        System.out.println("Enter number of deposited dollars at the beginning of a year.");
        double P = sc.nextDouble();
        
        // Get n.
        System.out.println("Enter number of years of deposition.");
        double n = sc.nextDouble();
        
        // Get i
        System.out.println("Enter annual interest rate (as a decimal number).");
        double i = sc.nextDouble();
        
        // Get S from method.
        double S = getS(P, n, i);
        
        // Display S.
        System.out.println("Amount in the account is " + S);
         
    }
    
    public static double getS(double P, double n, double i){
        double S;
        
        // Counts and return S.
        S = P * Math.pow(1 + i, n);
        return S;
              
    }
}
