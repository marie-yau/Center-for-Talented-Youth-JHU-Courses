import javax.swing.JOptionPane;
/**
 *
 * @author Marie Dohnalová
 * This program test Date class.
 * 
 */

public class DateExercise {
	
	public static void main(String[] args) {
                
		int day = 0, month = 0, year = 0;
                boolean a = true;
		Date date=new Date();
		
                // Get day, month, year and test if they are valid
                while (a) {
                    month = Integer.parseInt(JOptionPane.showInputDialog("Enter the valid month."));
                    if (month <= 12 && month >= 0){
                        a = false;
                    }
                }
                a = true;
                while (a){
                    day = Integer.parseInt(JOptionPane.showInputDialog("Enter the valid day."));
                    if (day >= 0 && day <= 31){
                        a = false;
                    }
                }
                a = true;
                while (a){
                    year = Integer.parseInt(JOptionPane.showInputDialog("Enter the valid year."));
                    if (year <= 9999 && year >= 0){
                        a = false;
                    }
                        
                }
		
		
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		
                // Display output
                date.display();
	}

}
