public class Name {
	private String firstName;
	private String lastName;
	
        /**
         * Constructors
         * Precondion: none (class and constructor must have the same name
         * Postcondition: initialize first and last name
         */
	public Name(){
		this.firstName="null";
		this.lastName="null";
	}

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
        // concatenate strings
	public String toString(){
		return firstName+" "+lastName;
	}
	
        // Getter and setter methods
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
}
