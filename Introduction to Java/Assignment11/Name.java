/**
 *
 * @author Marie Dohnalová
 * This class has methods that set and get first and last name, concatenate info to one string.
 */
public class Name {
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString(){
		return getFirstName()+" "+getLastName();
	}
}
