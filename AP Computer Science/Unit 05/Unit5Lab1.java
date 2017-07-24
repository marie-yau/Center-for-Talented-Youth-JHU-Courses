package unit5lab1;

import java.util.Scanner;

/**
 *
 * @author Marie Dohnalová
 * This program will count 3 financial functions.
 * 
 */
public class Unit5Lab1 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Choose an operation and enter its number:\n"
				+ "\t1) Future Value of a Single Sum\n"
				+ "\t2) Present Value of a Single Sum\n"
				+ "\t3) Future Value of an Annuity");
		int choice;
		choice=sc.nextInt();
		if(choice==1)
			futSingle();
		else if(choice==2)
			presSingle();
		else if(choice==3)
			futAnnuity();
		else
			System.out.println("Operation not allowed.");
	}

	private static void futSingle() {
		double P, F, n, i;
		System.out.println("Enter the number of dollars deposited:");
		P=sc.nextDouble();
		System.out.println("Enter the number of years:");
		n=sc.nextDouble();
		System.out.println("Enter the yearly interest rate in %:");
		i=sc.nextDouble();
		i/=1200;
		n*=12;
		F=Math.pow(1+i, n)*P;
		F=Math.round(F*100)/100d;
		System.out.println("After "+(int)n/12+" years there will be "+F+"$");
	}

	private static void presSingle() {
		double P, F, n, i;
		System.out.println("Enter the final number of dollars:");
		F=sc.nextDouble();
		System.out.println("Enter the number of years:");
		n=sc.nextDouble();
		System.out.println("Enter the yearly interest rate in %:");
		i=sc.nextDouble();
		i/=1200;
		n*=12;
		P=F/Math.pow(1+i, n);
		P=Math.round(P*100)/100d;
		System.out.println("The initial deposit will be "+P+"$");
	}

	private static void futAnnuity() {
		double A, F, i, n;
		System.out.println("Enter the number of dollars deposited each time:");
		A=sc.nextDouble();
		System.out.println("Enter the number of years:");
		n=sc.nextDouble();
		System.out.println("Enter the yearly interest rate in %:");
		i=sc.nextDouble();
		i/=1200;
		n*=12;
		F=A*(Math.pow(1+i, n)-1)/i;
		F=Math.round(F*100)/100d;
		System.out.println("After "+(int)n/12+" years there will be "+F+"$");
	}
}
