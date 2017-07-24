package unit5lab3_2;

import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program perform several operations with students tests scores.
 * 
 */
public class Unit5Lab3_2 {
	
	public static void main(String[] args){
		
		scoreStudent(1);
		scoreStudent(2);
		scoreStudent(3);
	}
	
	private static void scoreStudent(int num){
		Scanner sc=new Scanner(System.in);
		int s1, s2, s3, s4;
		System.out.println("Enter the 1° score for student #"+num);
		s1=sc.nextInt();
		System.out.println("Enter the 2° score for student #"+num);
		s2=sc.nextInt();
		System.out.println("Enter the 3° score for student #"+num);
		s3=sc.nextInt();
		System.out.println("Enter the 4° score for student #"+num);
		s4=sc.nextInt();
		double avg=getAvg(s1, s2, s3, s4);
		char grade=getGrade(avg);
		System.out.println("min: "+min(s1, s2, s3, s4)+", max: "+max(s1, s2, s3, s4)
				+", avg: "+avg+", grade: "+grade);
	}
	
	private static double getAvg(int s1, int s2, int s3, int s4){
		double avg=(double)(s1+s2+s3+s4)/4;
		avg=Math.round(avg*10)/10d;
		return avg;
	}
	
	private static char getGrade(double avg) {
		avg=Math.round(avg);
		if(avg>=90 && avg<=100)
			return 'A';
		else if(avg>=80 && avg<=89)
			return 'B';
		else if(avg>=70 && avg<=79)
			return 'C';
		else if(avg>=65 && avg<=69)
			return 'D';
		return 'F';
	}

	static int min(int a, int b, int c, int d){
		int m1=((a+b)-Math.abs(a-b))/2;
		int m2=((m1+c)-Math.abs(m1-c))/2;
		return ((m2+d)-Math.abs(m2-d))/2;
	}
	
	static int max(int a, int b, int c, int d){
		int m1=((a+b)+Math.abs(a-b))/2;
		int m2=((m1+c)+Math.abs(m1-c))/2;
		return ((m2+d)+Math.abs(m2-d))/2;
	}
}
