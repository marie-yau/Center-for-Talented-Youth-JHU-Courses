/**
 * 
 * @author Marie Dohnalová
 * This program creates a Person, Student, Employee, Faculty, and Staff object,
 * and invokes their toString() methods.
 */
public class Unit10Lab1 {
	
	public static void main(String[] args) {
		Person pers=new Person("John Doe",
								"Some Str. 42",
								"johndoe@mail.mail",
								"123456789",
								new Date(30, 4, 1998));
		Student stud=new Student("Mary Jane",
								"Other St. 11",
								"mj@aa.a",
								"987654321",
								new Date(1, 5, 1986),
								"sophomore");
		Employee empl=new Employee("Eod Nhoj",
								"Emos St. 24",
								"eodnhoj@liam.liam",
								"537832981",
								new Date(24, 12, 1967),
								2000.50,
								new Date(10, 1, 2000));
		Faculty fac=new Faculty("Richard Rellum",
								"Another Av. 100",
								"rrell@gmail.com",
								"495867382",
								new Date(9, 9, 1947),
								3299.99,
								new Date(4, 3, 1999),
								"14:40-18:00",
								"professor");
		Staff staff=new Staff("Bill Smith",
								"A St. 99",
								"smithb@abc.cba",
								"439875349",
								new Date(5, 4, 1961),
								2190.36,
								new Date(1, 5, 2005),
								"janitor");
		
		System.out.println(pers.toString());
		System.out.println(stud.toString());
		System.out.println(empl.toString());
		System.out.println(fac.toString());
		System.out.println(staff.toString());
	}

}
