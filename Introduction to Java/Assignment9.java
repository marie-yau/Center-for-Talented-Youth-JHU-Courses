package assignment9;
import java.util.Scanner;

/**
 *
 * @author Marie Dohnalová
 * This program prompts the user to input a string of words, then counts and displays 
 * the number of times each letter in the alphabet appears in the string.
 */
public class Assignment9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompts user to enter wors and store them to string.
        System.out.println("Please, enter words.");
        String words = sc.nextLine();
        
        System.out.println();
        
        int counter = 0;
        
        /* This loop tests every letter whether it is equal to some character in string.
        If it is then counter is increased by 1.
        */
        for (char letter = 'a'; letter <= 'z'; letter ++){
            for (int i = 0; i < words.length(); i ++){
                if (letter == words.charAt(i)){
                    counter++;
                }
                if (Character.toUpperCase(letter) == words.charAt(i)){
                    counter++;
                }
            }
            
            System.out.println("Letter " + Character.toUpperCase(letter) + " count = " + counter);
            counter = 0;
        }    
    }
    
}
