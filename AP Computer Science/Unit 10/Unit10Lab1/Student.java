
public class Student extends Person {

	private String status;

	public Student(String name, String address, String email, String phone,
			Date birth, String status) {
		super(name, address, email, phone, birth);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString(){
		return "Student "+getName();
	}
}
