/**
 * 
 * @author Marie Dohnalová
 * This program catches exception ArrayIndexOutOfBoundsException and displays further informations.
 */
public class ArrayIndexOutOfBoundsExceptionCatch {

	public static void main(String[] args) {
                // initialize array
		int[] a = {1, 2, 3};
		
                // try and catch exception
		try{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Index of the array is out of bounds!");
		}
	}
}
