/**
 * 
 * @author Marie Dohnalová
 * This program tests Name, Date and Person class.
 */
public class PersonMain {
	public static void main( String [] args ){
        
        //creat p2 object
	Person p2 = new Person( "Tony", "Baggadonuts", new Date(10, 21, 2001) );
        
        // Print information of p2 object
        System.out.println( p2.getFirstName() + "\t" + p2.getLastName() + "\t"
	+ p2.getBirthDate() );
	}
}
