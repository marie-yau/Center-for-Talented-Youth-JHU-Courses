package assignment3;

/**
 * This program counts value of expression (4 * A) / (3 * (B + C)). 
 * @author Marie Dohnalová
 *
 */
public class Assignment3 {

    public static void main(String[] args) {
        /* define and initilize values of A, B, C
        I used numeric type float for A, B, C because I wanted to avoid mixed mode expression 
        but as far as one of A, B, C will be float, the others can be any integer type */
        float A = 100;
        float B = 20;
        float C = 30;
        
        // define result as a float type because it may not be a hole number
        float result;
        
        /* define value of result by the expression as followed 
        the parentheses change order of evaluation
        so first it will count 4 * A and B + C, then 3 * (B + C) and then (4 * A) / (3 * (B + C)) */
        result = (4 * A) / (3 * (B + C));
        
        //display the output
        System.out.println("Values: A = " + A + ", B = " + B + ", C = " + C); 
        System.out.println("The result of expression (4 * A) / (3 * (B + C)) is " + result);
    }
    
}
