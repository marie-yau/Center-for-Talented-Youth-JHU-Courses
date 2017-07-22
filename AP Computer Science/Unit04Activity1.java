import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program performs multiplication quiz.
 * 
 */
public class Unit04Activity1{
	public static void main(String [] args){
		long startTime = System.currentTimeMillis();
                System.out.println("How many problems do you want to solve?");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int corrAnswers=0;
		
                
		for(int i = 0;i < num; i++){
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
			
			System.out.print("What is " + number1 + " * " + number2 + "? ");
			int answer = input.nextInt();
			
			int correct = number1 * number2;
			
			if (correct == answer){
				System.out.println("Congratulations...you are correct!");
				corrAnswers++;
			}
			else
				System.out.println("Wrong...the correct solution is " + correct + ".");
		}
		long endTime = System.currentTimeMillis();
		
		long duration = (endTime - startTime) / 1000;
		
		double percent = (double)(100 * corrAnswers) / num;
		percent = Math.round(percent * 100) / 100d;
		
		System.out.println("Score: " + percent + ", time: " + duration + "s");
	}
}
