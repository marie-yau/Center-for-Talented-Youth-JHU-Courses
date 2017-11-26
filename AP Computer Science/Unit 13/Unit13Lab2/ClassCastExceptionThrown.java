/**
 * 
 * @author Marie Dohnalová
 * This program throws ClassCastException because unallowed casting operation.
 */
public class ClassCastExceptionThrown {

	public static void main(String[] args) {
            
		Object a = new Integer("1");
		
		String s = (String)a;
	}
}

