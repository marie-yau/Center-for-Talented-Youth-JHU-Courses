/**
 *
 * @author Marie Dohnalová
 * This program generates and displays a 
 * sequence of 20 random numbers in the range 1 – 5.
 * 
 */

public class Unit5Activity1B {
	
	public static void main(String[] args){
		for(int i=0;i<20;i++){
			System .out.print((int)(Math.random()*5+1)+" ");
		}
	}
}
