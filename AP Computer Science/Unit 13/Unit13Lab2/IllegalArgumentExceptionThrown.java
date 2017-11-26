/**
 * 
 * @author Marie Dohnalová
 * This program throws IllegalArgumentException because -1 doesn't have square root in integers.
 */
public class IllegalArgumentExceptionThrown {

	public static void main(String[] args) {
                
		Integer a = getSqrt(-1);
	}
	// precondition: n must be initialized
	private static int getSqrt(int n) throws IllegalArgumentException{
		if(n < 0) throw new IllegalArgumentException();
		return (int)Math.sqrt(n);
	}
}

