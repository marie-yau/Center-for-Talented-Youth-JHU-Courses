import java.util.Scanner;

/**
 *
 * @author Marie Dohnalová
 * This program prompts the user to enter two numbers x and y, and displays the
 * value of x/y rounded to an integer value, to one decimal place, 
 * to two decimal places, and to three decimal places.
 * 
 */
public class Unit5Activity1D {
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double x, y;
		System.out.println("Enter x:");
		x=in.nextDouble();
		System.out.println("Enter y:");
		y=in.nextDouble();
		
		int integer=(int)Math.floor(x/y+0.5);
		double dec1=Math.floor(x/y*10+0.5)/10;
		double dec2=Math.floor(x/y*100+0.5)/100;
		double dec3=Math.floor(x/y*1000+0.5)/1000;
		
		System.out.println("Integer: "+integer+"\n"
				+ "1 dec. place: "+dec1+"\n"
				+ "2 dec. places: "+dec2+"\n"
				+ "3 dec. places: "+dec3);
	}
}
