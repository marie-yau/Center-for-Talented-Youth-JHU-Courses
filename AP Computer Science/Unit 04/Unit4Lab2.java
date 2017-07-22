import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program will display asterisks.
 * 
 */

public class Unit4Lab2 {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number of asterisks.");
		int max =sc.nextInt();
		
		for(int i=max;i>=1;i--){
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}