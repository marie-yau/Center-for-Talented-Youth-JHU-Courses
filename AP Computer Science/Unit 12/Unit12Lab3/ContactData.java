
public class ContactData{
	private String firstName, phone, email;
        
        // constructor
	public ContactData(String firstName, String phone, String email) {
		super();
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
	}
        
        
        // getters and setters
        
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
