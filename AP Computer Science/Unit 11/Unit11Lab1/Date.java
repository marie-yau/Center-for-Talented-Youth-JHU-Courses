
public class Date {

	private int day, month, year;
	// constructors
	public Date() {
		setDay(0);
		setMonth(0);
		setYear(0);
	}

	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	} 
	
        // display date
	public void display(){
		System.out.println("The date is: " + month + "/" + day + "/" + year);
	}
	
	
	// getters and setters
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
