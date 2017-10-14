public class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String email, String phone,
			Date birth, double salary, Date hireDate, String title) {
		super(name, address, email, phone, birth, salary, hireDate);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return "Staff "+getName();
	}
}
