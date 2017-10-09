
public class CounterTest {
	public static void main(String[] args) {
		CounterConsoleMenu countMenu = new CounterConsoleMenu();
		boolean run = true;
                
                // program is running until user writes quit
		while(run){
                        // show current value
			countMenu.showCount();
			String op = countMenu.getUserChoice();
			run = countMenu.performOp(op);
		}
	}
}
