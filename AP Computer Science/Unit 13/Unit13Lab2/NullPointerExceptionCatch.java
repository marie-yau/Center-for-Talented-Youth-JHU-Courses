/**
 * 
 * @author Marie Dohnalová
 * This program catches exception NullPointerException and displays further informations.
 */
public class NullPointerExceptionCatch {

	public static void main(String[] args) {
		String s = null;
                
		// try and catch exception
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.err.println("Referencing an object set to null!");
		}
	}
}
