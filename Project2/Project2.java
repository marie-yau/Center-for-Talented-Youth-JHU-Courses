/**
 * 
 * @author Marie Dohnalová
 * This program simulates a tortoise and hare race.
 */

public class Project2 {

	public static void main(String[] args) {
		Tortoise t = new Tortoise();
		Hare h = new Hare();
		
		System.out.println("AND THEY'RE OFF!!");
                
                // Print all lines
		do{
			h.move();
			t.move();
			
			int tPos = t.getPos();
			int hPos = h.getPos();
			
			//Print positions of hare and tortoise, " ", and | on one line 
			for(int i = 1; i <= 59; i++){
				if(i == tPos){
					if(i == hPos){
						System.out.print("OUCH!!");
						i += 5;
					}
					else
						System.out.print("T");
				}
				else if(i == hPos)
					System.out.print("H");
                                else if (i == 50 && i != hPos && i != tPos)
                                        System.out.print("|");  
                                else if (i == 59)
                                        System.out.println();
				else
					System.out.print(" ");
			}
			
		}
		while(t.getPos() < 50 && h.getPos() < 50);
                
		System.out.println();
                
                // Print the name of winner
		if(t.getPos() == 50 && h.getPos() == 50)
			System.out.println("IT'S A TIE!!");
		else if(t.getPos() == 50)
			System.out.println("TORTOISE WINS!!");
		else
			System.out.println("HARE WINS!!");
	}
}
