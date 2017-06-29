
/**
 *
 * @author Marie Dohnalová
 * This program will display asterisks.
 * 
 */

public class Assignment6B {
	
	public static void main(String[] args){
		
                // This sets number of asterisks in the first row.
		int max = 10;
		
		for(int i = max; i >= 1; i--){
                     
                        //This displays asterisks on one row.
			for(int j = 0;j < i; j++)
				System.out.print("*");
                        
                        // This will make cursor to go to another line.
			System.out.println("");
		}
	}
} 
