/**
 *
 * @author Marie Dohnalová
 * This class has method to set and get number, a name, an address, and a hire date, concatenate info to one string.
 */
public class Employee {
	private int number;
	private Name name;
	private Address address;
	private Date hireDate;
	
	public Employee(int number, Name name, Address address, Date hireDate){
		this.setNumber(number);
		this.setName(name);
		this.setAddress(address);
		this.setHireDate(hireDate);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public String toString(){
		return "["+getNumber()+"] - "+getName()+"\n\t"
				+"Address: "+getAddress()+"\n\t"
				+"Hire date: "+getHireDate();
	}
}
