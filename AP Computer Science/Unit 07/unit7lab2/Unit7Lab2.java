package unit7lab2;

/**
 *
 * @author Marie
 * This program tests a set of methods that converts numbers between different number systems.
 */
public class Unit7Lab2 {


        static int num=137;
	static String binaryString="1011100";
	static String hexString="5B1";
	
	public static void main(String[] args) {
		System.out.println("[bin]: "+binaryString+"\t-> [int]: "+set_of_methods.binaryToDecimal(binaryString));
		System.out.println("[bin]: "+binaryString+"\t-> [hex]: "+set_of_methods.binaryToHex(binaryString));
		System.out.println("[int]: "+num+"\t-> [bin]: "+set_of_methods.decimalToBinary(num));
		System.out.println("[int]: "+num+"\t-> [hex]: "+set_of_methods.decimalToHex(num));
	}

    
        
}
