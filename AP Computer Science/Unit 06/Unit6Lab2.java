package unit6lab2;
/**
 *
 * @author Marie
 * This program tests each of the methods in the ArrayTools class.
 */
public class Unit6Lab2 {
    static char[] charArray={'a', 'c', 'z', 'd', 's', 'e'};
    static int[] intArray={4, 21, 2, 65, 3, 7, 5};
    static double[] doubleArray={34.2, 45.1, 0.001, 10.9};
    
    public static void main(String[] args) {
        System.out.println("[CHAR] Minimum: "+Unit6Lab2.minimum(charArray)
							+" at position "+Unit6Lab2.minimumAt(charArray));
	System.out.println("[CHAR] Maximum: "+Unit6Lab2.maximum(charArray)
							+" at position "+Unit6Lab2.maximumAt(charArray));
		
	System.out.println("");
		
	System.out.println("[INT] Minimum: "+Unit6Lab2.minimum(intArray)
							+" at position "+Unit6Lab2.minimumAt(intArray));
	System.out.println("[INT] Maximum: "+Unit6Lab2.maximum(intArray)
							+" at position "+Unit6Lab2.maximumAt(intArray));
	System.out.println("[INT] Average: "+Unit6Lab2.average(intArray));

	System.out.println("");
		
	System.out.println("[DOUBLE] Minimum: "+Unit6Lab2.minimum(doubleArray)
							+" at position "+Unit6Lab2.minimumAt(doubleArray));
	System.out.println("[DOUBLE] Maximum: "+Unit6Lab2.maximum(doubleArray)
							+" at position "+Unit6Lab2.maximumAt(doubleArray));
	System.out.println("[DOUBLE] Average: "+Unit6Lab2.average(doubleArray));
        
    }
    static char minimum(char array[]){
		char m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]<m) m=array[i];
		return m;
	}
	
	static int minimum(int array[]){
		int m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]<m) m=array[i];
		return m;
	}
	
	static double minimum(double array[]){
		double m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]<m) m=array[i];
		return m;
	}
	
	static char maximum(char array[]){
		char m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]>m) m=array[i];
		return m;
	}
	
	static int maximum(int array[]){
		int m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]>m) m=array[i];
		return m;
	}
	
	static double maximum(double array[]){
		double m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]>m) m=array[i];
		return m;
	}
	
	static int minimumAt(char array[]){
		int ind=0;
		char m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]<m){m=array[i]; ind=i;}
		return ind;
	}
	
	static int minimumAt(int array[]){
		int ind=0;
		int m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]<m){m=array[i]; ind=i;}
		return ind;
	}
	
	static int minimumAt(double array[]){
		int ind=0;
		double m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]<m){m=array[i]; ind=i;}
		return ind;
	}
	
	static int maximumAt(char array[]){
		int ind=0;
		char m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]>m){m=array[i]; ind=i;}
		return ind;
	}
	
	static int maximumAt(int array[]){
		int ind=0;
		int m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]>m){m=array[i]; ind=i;}
		return ind;
	}
	
	static int maximumAt(double array[]){
		int ind=0;
		double m=array[0];
		for(int i=1;i<array.length;i++)
			if(array[i]>m){m=array[i]; ind=i;}
		return ind;
	}
	
	static double average(int array[]){
		double a=0;
		for(int i=0;i<array.length;i++) a+=array[i];
		return a/array.length;
	}
	
	static double average(double array[]){
		double a=0;
		for(int i=0;i<array.length;i++) a+=array[i];
		return a/array.length;
	}
}
