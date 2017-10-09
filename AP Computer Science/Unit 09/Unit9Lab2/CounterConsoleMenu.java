import java.util.Scanner;


public class CounterConsoleMenu {
	
	Counter counter = new Counter();
	
        /**
         * Precondition: counter must be initialized
         * Postcondition: none
         */
	void showCount(){
		System.out.println("Current counter value: " + counter.getCount());
	}
	
        /** 
         * Get user´s choice of operation
         * Precondition: none
         * Postcondition: return string
         */ 
	String getUserChoice(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Which operation you wish to perform?");
		System.out.println("1. Increment [incr]\n" +
							"2. Decrement [decr]\n" +
							"3. Reset [reset]\n" +
							"4. Quit [quit]");
		return sc.next();
	}
	
        /**
         * Perform operation
         * Precondition: none
         * Postcondition: return boolean
         */
	boolean performOp(String op){
		switch(op){
		case "incr":
			counter.increment();
			return true;
		case "decr":
			counter.decrement();
			return true;
		case "reset":
			counter.reset();
			return true;
		case "quit":
			return false;
		default:
			System.out.println("Operation " + op + " not recognized.");
			return true;
		}
	}
}
