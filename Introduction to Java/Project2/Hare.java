import java.util.Random;
/**
 * 
 * @author Marie Dohnalová
 * This class gets position of hare.
 */

public class Hare {
    
	private int pos;
	
        // Constructor sets position to 1
	public Hare(){
		pos = 1;
	}
        
        // Method to get position
	public int getPos() {
		return pos;
	}
	
	void move(){
                // Generate integer from 1 to 10
            	int n = new Random().nextInt(10)+1;
                
                // Move to position - based on generated number
		if (n >= 1 && n <= 2)
			pos += 9;
		else if (n >= 3 && n <= 5)
			pos += 1;
		else if (n == 6)
			pos -= 12;
		else if (n >= 7 && n <= 8)
			pos -= 2;
                // else: sleeping - doesn´t move
                
                // Decide about position
                if (pos < 1)
                        pos = 1;

	}
}

