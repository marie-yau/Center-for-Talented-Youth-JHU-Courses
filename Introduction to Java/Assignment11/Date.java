/**
 * 
 * @author Marie Dohnalová
 * This class has methods to set and get month, day and year, concatenate info to one string.
 */
public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
		if(day<1 || day>31)
			System.out.println("Invalid day number!");
		if(month<1 || month>12)
			System.out.println("Invalid month number!");
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
		if(day<1 || day>31)
			System.out.println("Invalid day number!");
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
		if(month<1 || month>12)
			System.out.println("Invalid month number!");
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString(){
		return getDay()+"/"+getMonth()+"/"+getYear();
	}
}
