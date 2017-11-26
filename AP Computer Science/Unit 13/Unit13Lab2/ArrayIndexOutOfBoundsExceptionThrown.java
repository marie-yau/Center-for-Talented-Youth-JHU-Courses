/**
 * 
 * @author Marie Dohnalová
 * This program throws an exception because array index is out of bounds.
 */
public class ArrayIndexOutOfBoundsExceptionThrown {

	public static void main(String[] args) {
                // initialize array
		int[] a = {1, 2, 3};
		
                // print number with nonexisting index
		System.out.println(a[3]);
	}
}

