package unit5lab2;

import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program will display calendar.
 * 
 */
public class Unit5Lab2 {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int month, year;
		System.out.println("Enter the month.");
		month=sc.nextInt();
		System.out.println("Enter the year.");
		year=sc.nextInt();
		
		if(month<1 || month>12){
			System.out.println("Invalid month "+month);
			return;
		}
		
		printMonthCalendar(month, year);
	}
	
	
	
	private static void printMonthCalendar(int m, int y) {
		printMonthHeader(m, y);
		printMonthBody(m, y);
	}

	private static void printMonthBody(int m, int y){
		System.out.print("  ");
		for(int i=1;i<=getNumDaysInMonth(m, y);i++){
			if(i<10) System.out.print(" ");
			System.out.print(i+"  ");
			if((i-1)%7==6) System.out.print("\n  ");
		}
	}

	private static void printMonthHeader(int m, int y) {
		System.out.println("        "+getMonthName(m)+" "+y);
		System.out.println("-----------------------------");
		
		int d=getStartDay(m, 1, y)-1;
		for(int i=0;i<7;i++){
			switch((i+d)%7){
			case 0:
				System.out.print(" Mon");
				break;
			case 1:
				System.out.print(" Tue");
				break;
			case 2:
				System.out.print(" Wed");
				break;
			case 3:
				System.out.print(" Thu");
				break;
			case 4:
				System.out.print(" Fri");
				break;
			case 5:
				System.out.print(" Sat");
				break;
			case 6:
				System.out.print(" Sun");
				break;
			}
		}
		System.out.println("");
	}

	private static String getMonthName(int m){
		switch(m){
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "";
		}
	}
	
	private static int getNumDaysInMonth(int m, int y){
		switch(m){
		case 1:
			return 31;
		case 2:
			return isLeapYear(y)?29:28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
	
	private static boolean isLeapYear(int y){
		if(y%100==0 && y%400==0) return true;
		if(y%100==0 && y%400!=0) return false;
		return y%4==0;
	}

	public static int getStartDay( int m, int d, int y )
	  {
	    // Adjust month number & year to fit Zeller's numbering system
	    if ( m < 3 ) 
	    {
	      m = m + 12;
	      y = y - 1;
	    }
	    
	    int k = y % 100;      // Calculate year within century
	    int j = y / 100;      // Calculate century term
	    int h = 0;            // Day number of first day in month 'm'
	    
	    h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
	    
	    // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
	    int dayNum = ( ( h + 5 ) % 7 ) + 1;     
	    
	    return dayNum;
	  }
}
