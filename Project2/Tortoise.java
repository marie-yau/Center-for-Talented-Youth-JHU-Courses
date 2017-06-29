import java.util.Random;
/**
 * 
 * @author Marie Dohnalová
 * This class gets position of tortoise.
 */

public class Tortoise {
    
	private int pos;
	
        // Constructor sets position to 1
	public Tortoise(){
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
		if (n >= 1 && n <= 5)
			pos += 3;
		else if (n >= 6 && n <= 8)
			pos += 1;
                else 
			pos -= 6;
		
                // Decide about position
                if (pos < 1) 
                        pos = 1;

	}
}
