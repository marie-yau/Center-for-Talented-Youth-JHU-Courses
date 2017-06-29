package assignment8;
import java.util.Random;
/**
 *
 * @author Marie Dohnalová
 * This program displays and sorts even and odd integers from array.
 */
public class Assignment8 {

    public static void main(String[] args) {
        Random rn = new Random();
        int number, counter_even = 0, counter_odd;
        int array [] = new int [100];
        
        // Generate 100 integers and count how many are even.
        for (int i = 0; i <= 99; i++){
            number = rn.nextInt(26);
            array[i] = number; 
            if (number % 2 == 0){
                counter_even++;
            }
        }    
        
        // Count how many integer are odd.
        counter_odd = 100 - counter_even;
        
        // Copy array from method to Array_even.
        int Array_even [] = SortEven(array, counter_even);
        System.out.println("These are even numbers from array.");
        
        // Print the Array_even.
        for (int m = 0; m < Array_even.length; m++){
            System.out.print(Array_even[m]);
            System.out.print(" ");
        }
        
        System.out.println();
        
        // Copy array from methods to Array_odd and print it.
        int Array_odd [] = SortOdd (array, counter_odd);
        System.out.println("These are odd numbers from array.");
        for (int n = 0; n < Array_odd.length; n++){
            System.out.print(Array_odd[n]);
            System.out.print(" ");
        }       
        
        System.out.println();
    }
    
    public static int [] SortEven(int array[], int counter_even){
        int Array_even [] = new int [counter_even];
        int a = 0;
        
        // Search for even numbers in array and store them to Array_even.
        for (int j = 0; j <= 99; j++){
            if (array[j] % 2 == 0){
                Array_even[a] = array[j];
                a++;
            }
        }
        return Array_even;
    }
    public static int [] SortOdd(int array[], int counter_odd){
        int Array_odd [] = new int [counter_odd];
        int a = 0;
        
        // Search for odd numbers in array and store them to Array_odd.
        for (int j = 0; j <= 99; j++){
            if (array[j] % 2 == 1){
                Array_odd[a] = array[j];
                a++;
            }
        }
        return Array_odd;
    }
    
}
