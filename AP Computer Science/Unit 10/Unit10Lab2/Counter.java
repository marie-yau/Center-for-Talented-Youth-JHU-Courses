public class Counter {
	private int count;
	// constructor
	public Counter(){
		count=0;
	}
	// getter method
	public int getCount(){
		return count;
	}
	// postcondition: increment counter by one
	public void increment(){
		count++;
	}
	// postcondition: decrement counter by one
	public void decrement(){
		count--;
	}
	// postcondition: set counter to zero
	public void reset(){
		count=0;
	}
}
