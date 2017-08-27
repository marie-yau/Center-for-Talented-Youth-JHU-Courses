package unit7lab2;

/**
 *
 * @author Marie
 * This is set of methods that is 
 */
public class set_of_methods {
	public static int binaryToDecimal( String binaryString ){
		return Integer.parseInt(binaryString, 2);
	}
	
	public static String binaryToHex( String binaryString ){
		return Integer.toHexString(binaryToDecimal(binaryString));
	}
	
	public static String decimalToBinary( int decimalNumber ){
		return Integer.toBinaryString(decimalNumber);
	}
	
	public static String decimalToHex( int decimalNumber ){
		return Integer.toHexString(decimalNumber);
	
	}  
}
