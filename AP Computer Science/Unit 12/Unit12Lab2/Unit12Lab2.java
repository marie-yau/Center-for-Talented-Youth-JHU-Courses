/**
 * 
 * This program store a list of print jobs in FIFO queue.
 * @autor Marie Dohnalová
 */
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Unit12Lab2 {

	public static void main(String[] args) {
		LinkedList<Job> queue = new LinkedList<>();
		boolean quit = false;
		int curId = 0;
		Random rnd = new Random(System.currentTimeMillis());
                // until user quit add jobs
		while(!quit){
			System.out.println("Choose:\n"
					+ "1) Add a job\n"
					+ "2) Quit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1)
                                queue.add(new Job(curId++, rnd.nextInt(991)+10));
			else
				quit = true;
		}
		// after quiting show jobs in queue
		System.out.println(queue.size() + " jobs in queue\n");
		for(int i = 0; i < queue.size(); i++)
			System.out.println("ID: " + queue.get(i).getId() + ", duration: " + queue.get(i).getDuration());
	}

}
