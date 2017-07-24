import java.util.Random;
/**
 *
 * @author Marie Dohnalová
 * This program generate 100 random numbers from the set { 6, 10, 14, 18, 22} and 
 * displays the number of 6’s, 10’s, etc. that are generated. 
 * Same sequence of random numbers is generated each time the program is run.
 * 
 */


public class Unit5Activity1C {
	
	public static void main(String[] args){
		int[] freq=new int[5];
		Random rand=new Random(0);
		
		for(int i=0;i<100;i++){
			int n=rand.nextInt(5);
			freq[n]++;
			System.out.print((n*4+6)+" ");
		}
		
		System.out.println("");
		
		for(int i=0;i<5;i++){
			System.out.println("#"+(i*4+6)+": "+freq[i]);
		}
	}
}
