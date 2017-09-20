public class Date {
	private int day;
	private int month;
	private int year;
	
        /**
         * Constructors
         * Precondition: none (class and constructor must have the same name)
         * Postcondition: initialize day, month and year
         */
        
	public Date(){
		this.day = 99;
		this.month = 99;
		this.year = 9999;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
        // concatenate strings
	public String toString(){
		return day+"/"+month+"/"+year;
	}
        
        // Getter and setter methods
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
