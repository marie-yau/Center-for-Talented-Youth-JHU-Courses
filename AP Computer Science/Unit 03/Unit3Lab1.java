package unit3lab1;
import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program prompts user to enter integer values for the sides of a triangle and then 
 * displays the values and the type of triangle they represent (if any).
 */
public class Unit3Lab1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter side a of the triagle.");
        int a_side = scan.nextInt();
 
        System.out.println("Enter side b of the triagle.");
        int b_side = scan.nextInt();
        
        System.out.println("Enter side c of the triagle.");
        int c_side = scan.nextInt();
        
        if(a_side > 0 && b_side > 0 && c_side > 0){
        
            if (a_side + b_side > c_side && b_side + c_side > a_side && a_side + c_side > b_side){
                if (a_side == b_side && a_side == c_side){
                    System.out.println("You entered values: a = " + a_side + ", b = " + b_side + ", c = " + c_side + ". " +
                        "These values make an equilateral triangle.");
                }
                else {
                    if (a_side == b_side ^ b_side == c_side ^ a_side == c_side){
                    System.out.println("You entered values: a = " + a_side + ", b = " + b_side + ", c = " + c_side + ". " +
                        "These values make an isosceles triangle.");
                    }
                    else {
                    System.out.println("You entered values: a = " + a_side + ", b = " + b_side + ", c = " + c_side + ". " +
                        "These values make a scalene triangle.");
                    }
                }          
            }
            else{
                System.out.println("You entered values: a = " + a_side + ", b = " + b_side + ", c = " + c_side + ". " +
                        "These values do not make a valid triangle.");
            }
        }   
        else
            System.out.println("You entered values: a = " + a_side + ", b = " + b_side + ", c = " + c_side + ". " +
                        "These values do not make a valid triangle.");
    }
    
}
