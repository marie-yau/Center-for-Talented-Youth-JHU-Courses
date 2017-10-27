public class MemoryCounter extends Counter {
	private int memory;
        //constructor
	public MemoryCounter() {
		super();
		memory = 0;
	}
	
        // getter method
	public int getMem(){
		return memory;
	}
	// postcondition: set to zero
	public void resetMem(){
		memory=0;
	}
	// postcondition: increase memory by one
	public void addMem(){
		memory+=getCount();
	}
}
