import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program will make user to guess the secret number.
 * 
 */

public class Unit04Lab1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean play = true;
		while(play){
			System.out.println("Secret number will be between 1 and N. Enter N:");
			int N = sc.nextInt();
			System.out.println("Enter the maximum number of guesses:");
			int max = sc.nextInt();
			
			int secret = (int)(N * Math.random()) + 1;
			
                        // moves = number of guesses
			int moves = 0;
			
			while(moves < max){
				System.out.println("Guess the secret number!");
				int choice = sc.nextInt();
				if(choice < secret)
					System.out.println("Too low");
				if(choice == secret)
					System.out.println("Correct");
				if(choice > secret)
					System.out.println("Too high");
				
				if(choice == secret) break;
				moves++;
			}
			
			if(moves == max)
				System.out.println("You guessed too many times. The secret number was " + secret + ".");
			
			System.out.println("Would you like to play again?(yes/no)");
			String ans = sc.next();
                        
			if(ans.equals("no")) play = false;
		}
	}
}
