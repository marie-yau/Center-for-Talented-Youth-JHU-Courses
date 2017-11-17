/**
 * 
 * This program creates 50 grocery items and sorts them into two ArrayList objects.
 * @author Marie Dohnalová
 */
import java.util.ArrayList;
import java.util.Random;

public class Unit12Lab1 {
	
	public static void main(String[] args) {
		GroceryItem items[] = new GroceryItem[50];
		Random rnd = new Random(System.currentTimeMillis());
                // generate items
		for(int i = 0; i < 50; i++){
			int life = rnd.nextInt(30) + 1;
			items[i] = new GroceryItem(i, life);
		}
		
		ArrayList<GroceryItem> underSeven = new ArrayList<>();
		ArrayList<GroceryItem> overSeven = new ArrayList<>();
		
                // sort items and add them to ArrayList
		for(int i = 0; i < 50; i++){
			if(items[i].getShelfLife() <= 7)
				underSeven.add(items[i]);
			else
				overSeven.add(items[i]);
		}
		
                // display number of items and display items
		System.out.println(underSeven.size() + " items with shelf life <= 7 days\n");
		for(int i = 0; i < underSeven.size(); i++)
			System.out.println((i + 1) + ": " + underSeven.get(i).getSerialNumber());
		System.out.println("-");
		System.out.println(overSeven.size() + " items with shelf life >7 days\n");
		for(int i = 0; i < overSeven.size(); i++)
			System.out.println((i + 1) + ": " + overSeven.get(i).getSerialNumber());
	}

}
