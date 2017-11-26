/**
 * 
 * @author Marie Dohnalová
 * This program catches exception ClassCastException and displays further informations.
 */
public class ClassCastExceptionCatch {

	public static void main(String[] args) {
                
		Object a = new Integer("1");
		
		try{
			String s = (String)a;
		}
		catch(ClassCastException e){
			System.err.println("Illegal casting operation attempted!");
		}
	}
}
