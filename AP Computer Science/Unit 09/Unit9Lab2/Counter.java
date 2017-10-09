
public class Counter {
	private int count; 
        
	
        /**
        * Precondition: none (class has to have the same name as constructor)
        * Postcondition: variable count is initialized to 0
        */	
	public Counter(){
		count=0;
	}
        
	// Getter method
	public int getCount(){
		return count;
	}
        
        /**
         * Precondition: none
         * Postcondition: value of variable count is increased by 1
         */	
	public void increment(){
		count++;
	}

        /**
         * Precondition: none
         * Postcondition: value of variable count is decreased by 1
         */	        
	public void decrement(){
		count--;
	}

        /**
         * Precondition: none
         * Postcondition: value of variable count is set to 0
         */	        
	public void reset(){
		count=0;
	}
}
