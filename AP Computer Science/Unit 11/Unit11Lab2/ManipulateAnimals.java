/**
 * 
 * @author Marie Dohnalová
 * This program uses Animal class to model some basic characteristics of animals.
 */
public class ManipulateAnimals {
	
	public static void main(String[] args){
                
                // generate array
		Concept[] c = new Concept[4];
                
                // initialize Animal objects
		c[0] = new Animal("dog");
		c[1] = new Animal("cat");
                
                // initialize Vehicle objects
		c[2] = new Vehicle("car", 7);
		c[3] = new Vehicle("bus", 12);
		
                // loop through the array and execute the drawObject(), rotateObject(), resizeObject(), and playSound()
		for(int i = 0; i < 4; i++){
			System.out.println(i + 1 + ")");
			c[i].drawObject();
			c[i].resizeObject();
			c[i].rotateObject();
			c[i].playSound();
		}
	}
}
