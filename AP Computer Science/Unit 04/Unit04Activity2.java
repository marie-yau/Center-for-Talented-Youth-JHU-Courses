import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Marie Dohnalová
 * This program will display 12 circles. 
 * 
 */

public class Unit04Activity2 extends JPanel{
	
	public void paintComponent(Graphics g){
		int width = getWidth(), height = getHeight();
		int hStep = width / 15, vStep = height / 15;
		System.out.println(hStep + " " + vStep);
		int i = 1;
		while(i <= 12){
			int radius = i * 10;
			g.drawOval(width / 2 - radius, height / 2 - radius, 2 * radius, 2 * radius);
                        i++;
		}
	}
	
	public static void main(String[] args){
		Unit04Activity2 panel = new Unit04Activity2();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
}


