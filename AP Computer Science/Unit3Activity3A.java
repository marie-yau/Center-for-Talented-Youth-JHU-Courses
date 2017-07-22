import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marie Dohnalová 
 * This program will display lines.
 * Exercise 3.1A. 
 */
public class Unit3Activity3A extends JPanel{
	
	public void paintComponent (Graphics g){
		int width = getWidth(), height = getHeight();
		int hStep = width / 15, vStep = height / 15;
		System.out.println(hStep + " " + vStep);
		for(int i = 1;i <= 15; i++){
			g.drawLine(0, 0, hStep * i, height - vStep * i);
		}
	}
	
	public static void main(String[] args){
		Unit3Activity03A panel = new Unit3Activity3A();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
}
 
