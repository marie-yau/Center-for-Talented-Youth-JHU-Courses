public class Person {
	private Name name;
	private Date birthDate;
        /**
         * Constructors
         * Precondition: none (class and constructor must have the same name)
         * Postcondition: initialize name and birthDate
         */	
	public Person(){
		this.name = new Name();
		this.birthDate = new Date();
	}
	
	public Person(String fName, String lName, Date birth) {
		this.name = new Name(fName, lName);
		this.birthDate = birth;
	}
	
        // display name and birthDate
	public void dysplay(){
		System.out.println(this.toString());
	}
	
        // concatenate strings
	public String toString(){
		return name.toString()+" "+birthDate.toString();
	}
        
        // Getter and setter methods
	public String getFirstName(){
		return name.getFirstName();
	}
	
	public void setFirstName(String firstName){
		name.setFirstName(firstName);
	}
	
	public String getLastName(){
		return name.getLastName();
	}
	
	public void setLastName(String lastName){
		name.setLastName(lastName);
	}

	public String getBirthDate() {
		return birthDate.toString();
	}

	public void setBirthDate(int d, int m, int y) {
		this.birthDate = new Date(d, m, y);
	}
}
