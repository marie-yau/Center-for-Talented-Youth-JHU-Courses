/**
 * 
 * @author Marie Dohnalová
 * This program tests functionality of MemoryCounterConsoleMenu, MemoryCounter, Counter.
 */
public class MemoryCounterTest {

	public static void main(String[] args) {
		MemoryCounterConsoleMenu menu=new MemoryCounterConsoleMenu();
		boolean run=true;
                
                // run program until user quit
		while(run){
			menu.dysplayCount();
			menu.dysplayMem();
			
			System.out.println("------");
			
			menu.dysplayMenu();
			
                        // decide what operation to perform
			int action = menu.getUserInput();
			switch(action){
			case 1:
				menu.incrementCount();
				break;
			case 2:
				menu.decrementCount();
				break;
			case 3:
				menu.resetCount();
				break;
			case 4:
				menu.addMem();
				break;
			case 5:
				menu.resetMem();
				break;
			case 6:
				run=false;
				break;
			}
		}
	}

}
