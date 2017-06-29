package assignment6a;

/**
 *
 * @author Marie Dohnalová
 * This program displays the sum of the even integers and the sum of the odd integers in range 0 to 25.
 */
public class Assignment6A {

    
    public static void main(String[] args) {
        
        // This declare and initialize to zero sum of odd and sum of even integers.
        int sum_odd = 0, sum_even = 0;
        
        // Block inside for loop will be done for numbers in range 0 to 25.
        for(int number = 0; number <=25; number++){
            
            // This finds out if number is even or odd and then sum it with sum of odd or even integers.
            if(number%2 == 0){
                sum_even += number;
            }
            else {
                sum_odd += number;
            }
        }
        
        // This prints sum of odd and even integers.
        System.out.println("The sum of even integers is " + sum_even+".");
        System.out.println("The sum of odd integers is " + sum_odd+".");
    }
    
} 
