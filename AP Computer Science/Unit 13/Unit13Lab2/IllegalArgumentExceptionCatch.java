/**
 * 
 * @author Marie Dohnalová
 * This program catches exception IllegalArgumentException and displays further informations.
 */
public class IllegalArgumentExceptionCatch {

	public static void main(String[] args) {
		Integer a;
                
                // try and catch exception
		try{
			a = getSqrt(-1);
		}
		catch(IllegalArgumentException e){
			System.err.println("Illegal arguments passed!");
		}
	}
	// precondition: n must be initialized
	private static int getSqrt(int n) throws IllegalArgumentException{
		if(n<0) throw new IllegalArgumentException();
		return (int)Math.sqrt(n);
	}
}
