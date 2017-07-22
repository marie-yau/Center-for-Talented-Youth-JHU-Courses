import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marie Dohnalová
 * This program will display lines.
 * Exercise 3.2A.
 */
public class Unit3Activity3C extends JPanel{
	
	public void paintComponent(Graphics g){
		int width = getWidth(), height = getHeight();
		int hStep = width / 15, vStep = height / 15;
		System.out.println(hStep + " " + vStep);
		int i = 1;
		while(i++ <= 15){ 
			g.drawLine(0, vStep * i, hStep * i, height);
		}
	} 
	
	public static void main(String[] args){
		Unit3Activity3C panel = new Unit3Activity3C();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize(400, 400);
		application.setVisible(true);
	} 
}
