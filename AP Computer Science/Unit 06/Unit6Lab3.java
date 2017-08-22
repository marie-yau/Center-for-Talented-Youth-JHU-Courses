package unit6lab3;

import java.util.Arrays;

/**
 *
 * @author Marie Dohnalová
 * This program tests methods.
 */
public class Unit6Lab3 {
    


    static char[] charArray={'a', 'c', 'z', 'd', 's', 'e'};
    static char[] charArray2={'a', 'd', 'g', 'e', 'f', 'm'};
    static int[] intArray={4, 21, 2, 65, 3, 7, 5};
    static int[] intArray2={7, 3, 98, 5, 6, 10, 9};
    static double[] doubleArray={34.2, 45.1, 0.001, 10.9};
    static double[] doubleArray2={54.1, 4.99, 87.5, 3.2, 6.3};
    
    public static void main(String[] args) {

		System.out.println("Char array 1:");
		printArray(charArray);
		System.out.println("Char array 2:");
		printArray(charArray2);
		System.out.println("Equals: "+Unit6Lab3.equals(charArray, charArray2));
		System.out.println("Find 'g' in array 2: "+Unit6Lab3.find(charArray2, 'g'));
		System.out.println("Sort array 1: ");
		Unit6Lab3.sort(charArray);
		printArray(charArray);
		
		System.out.println("");
		
		System.out.println("Int array 1:");
		printArray(intArray);
		System.out.println("Int array 2:");
		printArray(intArray2);
		System.out.println("Equals: "+Unit6Lab3.equals(intArray, intArray2));
		System.out.println("Find 6 in array 2: "+Unit6Lab3.find(intArray2, 6));
		System.out.println("Sort array 1: ");
		Unit6Lab3.sort(intArray);
		printArray(intArray);
		
		System.out.println("");
		
		System.out.println("Double array 1:");
		printArray(doubleArray);
		System.out.println("Double array 2:");
		printArray(doubleArray2);
		System.out.println("Equals: "+Unit6Lab3.equals(doubleArray, doubleArray2));
		System.out.println("Find 56.1 in array 2: "+Unit6Lab3.find(doubleArray2, 56.1));
		System.out.println("Sort array 1: ");
		Unit6Lab3.sort(doubleArray);
		printArray(doubleArray);
    }
    static void printArray(char[] a){
		for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		System.out.println("");
	}
	
    static void printArray(int[] a){
		for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		System.out.println("");
	}
	
    static void printArray(double[] a){
		for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		System.out.println("");
	}


    static boolean equals(char a1[], char a2[]){
		return Arrays.equals(a1, a2);
	}
	
    static boolean equals(int a1[], int a2[]){
		return Arrays.equals(a1, a2);
	}
	
    static boolean equals(double a1[], double a2[]){
		return Arrays.equals(a1, a2);
	}
	
    static int find(char array[], char key){
		for(int i=0;i<array.length;i++)
			if(array[i]==key) return i;
		return -1;
	}
	
    static int find(int array[], int key){
		for(int i=0;i<array.length;i++)
			if(array[i]==key) return i;
		return -1;
	}
	
    static int find(double array[], double key){
		for(int i=0;i<array.length;i++)
			if(array[i]==key) return i;
		return -1;
	}
	
    static void sort(char array[]){
		Arrays.sort(array);
	}
	
    static void sort(int array[]){
		Arrays.sort(array);
	}
	
    static void sort(double array[]){
		Arrays.sort(array);
	}
}
