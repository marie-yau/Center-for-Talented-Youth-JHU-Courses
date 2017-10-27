import java.util.Scanner;


public class MemoryCounterConsoleMenu {
	private MemoryCounter count;
	
        // constructor
	public MemoryCounterConsoleMenu(){
		count=new MemoryCounter();
	}
	
        /*
        Display possibilities to select methods
        Precondition and postcondition: none
        */
	public void dysplayMenu(){
		System.out.println("Select an action:\n"
				+ "1) Increment counter\n"
				+ "2) Decrement counter\n"
				+ "3) Reset counter\n"
				+ "4) Add memory\n"
				+ "5) Reset memory\n"
				+ "6) Quit");
	}
	// getter method
	public int getUserInput(){
		int in;
		Scanner sc=new Scanner(System.in);
		in=sc.nextInt();
		if(in<1 || in>6)
			System.out.println("Invalid input value, (choose an action in the interval 1-5)");
		return in;
	}
	// display current value
	void dysplayCount(){
		System.out.println("Current value: "+count.getCount());
	}
	
        
	void incrementCount(){
		count.increment();
	}
	
	void decrementCount(){
		count.decrement();
	}
	
	void resetCount(){
		count.reset();
	}
	
        // display memory value
	void dysplayMem(){
		System.out.println("Memory value: "+count.getMem());
	}
	
	void resetMem(){
		count.resetMem();
	}
	
	void addMem(){
		count.addMem();
	}
}
