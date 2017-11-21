/**
 * 
 * @author Marie Dohnalová
 * This program modifies the CatchExceptions6 program I wrote as part of lecture 
 * 13.4 to allow the user repeated tries at entering a correct value for the divisor.
 * 
 */
import java.util.Scanner;
public class U13L1 {
	
        static Scanner sc = new Scanner(System.in);
        
	public static void main(String[] args){
		System.out.println();
                
		try{
			divide(10, 0);
		}
		catch(DivideByZeroException e){
			int n = input();
		}
	}
	/*
        postcondition: return integer
        */
	static int input(){
                
		try{
			System.out.println("Please, enter nonzero demoninator.");
			int n = sc.nextInt();
			divide(10, n);
			return n;
		}
                // recursive 
		catch(DivideByZeroException ex){
			return input();
		}
	}


	/*
        precondition: x and y must be initialized
        postcondition: return integer
        */
	public static int divide(int x, int y) throws DivideByZeroException{
		int result = 0;
		try{
			result = x / y;
		}
		catch(ArithmeticException e){
			throw new DivideByZeroException(y);
		}
		return result;
	}
        

}