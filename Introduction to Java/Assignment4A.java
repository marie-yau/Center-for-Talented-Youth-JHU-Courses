package assignment4a;

/**
 *
 * @author Marie
 * This program will display what day of week it is today.
 */
public class Assignment4A {

    
    public static void main(String[] args) {
        // This declares constants and initialize their value.
        final int MONDAY = 1, TUESDAY = 2, WEDNESDAY = 3, THURSDAY = 4, FRIDAY = 5, SATURDAY = 6, SUNDAY = 7;
        
        int day_of_week = 4;
        
        // This decided what day of week is.
        switch (day_of_week){
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;                
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;    
            default:
                System.out.println("Invalid Data");
                break;
        }
        
        
    }
     
}
