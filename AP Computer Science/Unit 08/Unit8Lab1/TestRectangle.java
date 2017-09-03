import java.util.Scanner;
/**
 * 
 * @author Marie Dohnalová
 * This program tests the methods in the Rectangle class. 
 */

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
                
                // we may set length and width like that or use constructor in class Rectangle
		//Invalid length
		System.out.println("Setting length = 31...");
		rect.setLength(31);
		//Valid length
		System.out.println();
		System.out.println("Setting length = 10...");
		rect.setLength(10);
                
		//Invalid width
		System.out.println();
		System.out.println("Setting width = 0...");
		rect.setWidth(0);
		//Valid width
		System.out.println();
		System.out.println("Setting width = 15...");
		rect.setWidth(15);

		System.out.println();
		System.out.println("Rect dimensions: "+rect.getLength()+"x"+rect.getWidth());
		System.out.println();
		System.out.println("Perimeter: "+rect.getPerimeter());
		System.out.println();
		System.out.println("Area: "+rect.getArea());
		System.out.println();
		System.out.println("Drawing the rectangle...");
                
                Scanner sc=new Scanner(System.in);
                
                
                String character = "*";
                boolean invalid = true;
                while (invalid){
                    System.out.println("Choose a signl character for drawing the rectangle.");
                    character = sc.next();
                    if (character.length() == 1)
                        invalid = false;
                }
                System.out.println();
		rect.drawRect(character);
	}

}
