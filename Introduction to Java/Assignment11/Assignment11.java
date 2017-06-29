import java.util.Scanner;
/**
 * 
 * @author Marie Dohnalová
 * This program displays the data about employees.
 */

public class Assignment11 {

	static Employee[] emp;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many employees do you have?");
		int num = sc.nextInt();
		
		emp = new Employee[num];
		
				
		// Load informations about employees
		for(int i = 0; i<num; i++){
			int number, day, month, year;
			String firstName, lastName, street, city, state, zip;
			
			System.out.println();
                        System.out.println("Employee "+ (i+1));
			
			System.out.println("Enter the employee number:");
			number=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the first name:");
			firstName=sc.nextLine();
			System.out.println("Enter the last name:");
			lastName=sc.nextLine();

			System.out.println("Enter the street:");
			street=sc.nextLine();
			System.out.println("Enter the city:");
			city=sc.nextLine();
			System.out.println("Enter the state (2 letters):");
			state=sc.nextLine();
			System.out.println("Enter the zip code (5 digits):");
			zip=sc.nextLine();
			
			System.out.println("Enter the hire date: day month year separated by a space:");
			day=sc.nextInt();
			month=sc.nextInt();
			year=sc.nextInt();
			
                        // Store informations to array
			emp[i]=new Employee(
					number,
					new Name(firstName, lastName),
					new Address(street, city, state, zip),
					new Date(day, month, year));
		}
		
		System.out.println("-------------------");
		
		// Print informations from array
		for(int i = 0; i < num; i++)
			System.out.println(emp[i] + "\n");
	}

}
