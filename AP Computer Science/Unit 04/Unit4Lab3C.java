import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program prompts the user to enter a series of 10 integers and then
 * determines and displays the largest and smallest values entered.
 * 
 */

public class Unit4Lab3C {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int counter, number, smallest, largest;
		
                counter=10;
		
		System.out.println("Enter a number.");
		number=sc.nextInt();
		smallest=number;
		largest=number;
		counter--;
		
		do{
			System.out.println("Enter a number.");
			number=sc.nextInt();
			
			if(number<smallest) 
                            smallest=number;
			if(number>largest) 
                            largest=number;
		}while(--counter>0);
		
		System.out.println("Largest: "+largest+", smallest: "+smallest);
	}
}

