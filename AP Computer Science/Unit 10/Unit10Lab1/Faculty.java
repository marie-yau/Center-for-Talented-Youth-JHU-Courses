
public class Faculty extends Employee {
	
	private String officeHours, rank;

	public Faculty(String name, String address, String email, String phone,
			Date birth, double salary, Date hireDate, String officeHours,
			String rank) {
		super(name, address, email, phone, birth, salary, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString(){
		return "Faculty "+getName();
	}
}
