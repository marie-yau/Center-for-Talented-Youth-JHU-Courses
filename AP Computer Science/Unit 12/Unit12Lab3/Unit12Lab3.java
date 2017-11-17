/**
 * 
 * This program implements contact list.
 * @author Marie Dohnalová
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Unit12Lab3 {

	public static void main(String[] args) {
		TreeMap<String, ContactData> contacts = new TreeMap<>();
		
                // choose contact file
		System.out.println("Enter the name of the contacts file");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		
		readContactFile(fileName, contacts);
		
                // add, remove, show constacts until user quits
		boolean stop = false;
		while(!stop){
			System.out.println("Select an operation:\n"
					+ "1) Add a contact\n"
					+ "2) Remove a contact\n"
					+ "3) Show contacts\n"
					+ "4) Quit");
			int op = sc.nextInt();
			switch(op){
			case 1:
				addContact(contacts);
				break;
			case 2:
				removeContact(contacts);
				break;
			case 3:
				showContacts(contacts);
				break;
			case 4:
				stop = true;
				break;
			default:
				System.out.println("Undefined operation!");
				break;
			}
		}
		
		updateContactFile(fileName, contacts);
	}
        
        /*
        add contact
        postcondition: contact is added to the treemap
        */
	private static void addContact(TreeMap<String, ContactData> contacts) {
		String fName, lName, phone, email;
		Scanner sc = new Scanner(System.in);
                
                // get information from user
		System.out.println("Enter first name:");
		fName = sc.next();
		System.out.println("Enter last name:");
		lName = sc.next();
		System.out.println("Enter phone number:");
		phone = sc.next();
		System.out.println("Enter email address:");
		email = sc.next();
		
		contacts.put(lName, new ContactData(fName, phone, email));
	}
        
        /*
        remove contact
        precondition: removed contact must exist
        postcondition: contact is removed from treemap
        */
	private static void removeContact(TreeMap<String, ContactData> contacts) {
		String fName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name:");
		fName=sc.next();
		
		contacts.remove(fName);
	}
        
        /*
        show contact
        precondition: contact to be showed must exist
        */
	private static void showContacts(TreeMap<String, ContactData> contacts) {
		System.out.println("Contacts:");
		for(Entry<String, ContactData> entry : contacts.entrySet()){
			System.out.println("\t" + entry.getKey() + " " + entry.getValue().getFirstName() +
					" - " + entry.getValue().getPhone() + ", " + entry.getValue().getEmail());
		}
	}
        /*
        read contact file
        precondition: file must exist and must be formatted
        postcondition: contacts are loaded to program
        */
	private static void readContactFile(String fileName,
			TreeMap<String, ContactData> contacts) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found!");
		}
		
		String line = "", fName, lName, phone, email;
		Scanner sc;
		try {
			while((line = reader.readLine())!=null){
				sc = new Scanner(line);
				lName = sc.next();
				fName = sc.next();
				phone = sc.next();
				email = sc.next();
				
				contacts.put(lName, new ContactData(fName, phone, email));
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error while reading from file!");
		}
	}
	/*
        update contact file
        precondition: file must exist
        postcondition: data are updated in file
        */
	private static void updateContactFile(String fileName,
			TreeMap<String, ContactData> contacts){
		System.out.println("Writing " + contacts.size() + " entries");
		BufferedWriter writer=null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
		} catch (IOException e) {
			System.out.println("Input file not found!");
		}

		try {
			for(Entry<String, ContactData> entry : contacts.entrySet()){
					writer.write(entry.getKey() + " " + entry.getValue().getFirstName() +
							" " + entry.getValue().getPhone() + " " + entry.getValue().getEmail() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Error while writing to file!");
		}
	}
}
