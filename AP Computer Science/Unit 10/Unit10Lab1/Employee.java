
public class Employee extends Person {
	double salary;
	Date hireDate;
	
	public Employee(String name, String address, String email, String phone,
			Date birth, double salary, Date hireDate) {
		super(name, address, email, phone, birth);
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public String toString(){
		return "Employee "+getName();
	}
}
