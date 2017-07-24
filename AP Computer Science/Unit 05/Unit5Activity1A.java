import java.util.Scanner;

/**
 *
 * @author Marie Dohnalová
 * This program displays the angle in degrees, in radians, and the Sine,
 * Cosine, and Tangent of the angle.
 * 
 */
public class Unit5Activity1A {
	
	public static void main(String[] args){
		double angle;
		System.out.println("Enter the angle in degrees:");
		Scanner in=new Scanner(System.in);
		angle=in.nextDouble();
		
		//Round to 4 decimal places (better for double precision)
		double rad=Math.round(Math.toRadians(angle)*10000)/10000d;
		double sin=Math.round(Math.sin(Math.toRadians(angle))*10000)/10000d;
		double cos=Math.round(Math.cos(Math.toRadians(angle))*10000)/10000d;
		double tan=Math.round(Math.tan(Math.toRadians(angle))*10000)/10000d;
		
		System.out.println("Degrees: "+angle);
		System.out.println("Radians: "+rad);
		System.out.println("Sine: "+sin);
		System.out.println("Cosine: "+cos);
		System.out.println("Tangent: "+tan);
	}
}
