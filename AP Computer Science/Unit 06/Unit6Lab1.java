package unit6lab1;
import java.util.Scanner;
/**
 *
 * @author Marie
 * This program prompts the user to enter integers in the range 1 to 50 and 
 * counts the occurrences of each integer.
 */
public class Unit6Lab1 {

   
    public static void main(String[] args) {
        System.out.println("Enter integers in range 1 - 50. How many integers will be entered?");
        Scanner sc=new Scanner(System.in);
        int number_integer = sc.nextInt();
        
        int numbers [] = new int [number_integer];
        
        for (int i = 1; i<=number_integer; i++){
            System.out.println("Enter " + i+ ". integer.");
            numbers[i-1] = sc.nextInt();
            if (numbers[i-1]<1 || numbers[i-1]>50){
                System.out.println("Please, enter integers in range 1 - 50.");
                i--;
            }
        }
        System.out.println("You entered all " + number_integer+" integers.");
        System.out.println();
        int occurence [] = new int [50];
        for(int k=1; k<=50; k++){
        int counter = 0;
            for (int n = 0; n<number_integer;n++){
                if (numbers[n] == k)
                    counter++;
            }
        occurence[k-1]=counter;
                                
                
        if (occurence[k-1] != 0){
            System.out.println(k +" occures " + occurence[k-1] + " times");
        } 
        }
        
        
        
    }
    
}
