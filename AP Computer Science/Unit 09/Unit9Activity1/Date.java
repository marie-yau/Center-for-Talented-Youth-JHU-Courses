import javax.swing.JOptionPane;


public class Date {

	private int day, month, year;
	
        /**
         * Constructors
         * Precondition: none (class and constructor must have the same name)
         * Postconditions: variables will be initialized
         */
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
	
        /**
         * Display the date
         * Precondition: variables month, day, year must be initialized
         * Postcondition: none
         */
	public void display(){
		JOptionPane.showMessageDialog(null, "The date is: " + month + "/" + day + "/" + year);
	}
	
	
        // Getters and setters
	
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

