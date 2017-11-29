/**
 * 
 * @author Marie Dohnalová
 * This program performs Bubble Sort on the array.
 */
import java.util.Random;


public class BubbleSort {
	
	static int[] a = new int[10];

	public static void main(String[] args) {
            
                // initialize array with random numbers
		Random r = new Random();
                for(int i = 0; i < 10; i++)
			a[i] = r.nextInt(100) + 1;
		
                // print array
		for(int i = 0; i < 10; i++)
			System.out.print(a[i] + " ");
                
                System.out.println();
		bubbleSort();
                
                // print sorted array
		for(int i = 0; i < 10; i++)
			System.out.print(a[i] + " ");
	}
        
        /*
        perform bubble sort
        precondition: array with 10 elements has to be initialized
        postcondition: array is sorted
        */
	private static void bubbleSort() {
		for(int i = 10; i > 0; i--){
			for(int j = 0; j < i - 1; j++){
				if(a[j] > a[j + 1]){
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

}
