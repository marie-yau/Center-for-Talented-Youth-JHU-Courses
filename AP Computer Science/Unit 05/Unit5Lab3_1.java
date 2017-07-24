package unit5lab3_1;

/**
 *
 * @author Marie Dohnalová
 * This program returns minimum and maximum of three values.
 * 
 */
public class Unit5Lab3_1 {
	
	public static void main(String[] args){
		System.out.println("maximum(1, 2, 3)="+maximum(1, 2, 3));
		System.out.println("minimum(1, 2, 3)="+minimum(1, 2, 3));
		System.out.println("-----------");
		System.out.println("maximum(4, 10, 3)="+maximum(4, 10, 3));
		System.out.println("minimum(4, 10, 3)="+minimum(4, 10, 3));
		System.out.println("-----------");
		System.out.println("maximum(3, 1, 5)="+maximum(3, 1, 5));
		System.out.println("minimum(3, 1, 5)="+minimum(3, 1, 5));
	}
	
	static int minimum(int a, int b, int c){
		int m1=((a+b)-Math.abs(a-b))/2;
		return ((m1+c)-Math.abs(m1-c))/2;
	}
	
	static int maximum(int a, int b, int c){
		int m1=((a+b)+Math.abs(a-b))/2;
		return ((m1+c)+Math.abs(m1-c))/2;
	}
}