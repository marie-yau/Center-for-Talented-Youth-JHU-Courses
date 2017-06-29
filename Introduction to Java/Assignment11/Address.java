/**
 * 
 * @author Marie Dohnalová
 * This class has methods to get and set a street, a city, a state (2 characters),
 * and a 5-digit zip code, concatenate info to one string.
 */
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String street, String city, String state, String zip){
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		
		if(state.length() != 2)
			System.out.println("Invalid state code!");
		if(zip.length() != 5)
			System.out.println("Invalid zip code!");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		if(state.length()!=2)
			System.out.println("Invalid state code!");
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
		if(zip.length()!=5)
			System.out.println("Invalid zip code!");
	}
	
	public String toString(){
		return getStreet()+", "+getCity()+", "+getState()+", "+getZip();
	}
}
