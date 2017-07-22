import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
/**
 *
 * @author Marie Dohnalová
 * This program will display lines.
 * Exercise 3.1B. 
 */
public class Unit3Activity3D extends JPanel{
	
	public void paintComponent(Graphics g){
		int width = getWidth(), height = getHeight();
		int hStep = width / 15, vStep = height / 15;
		System.out.println(hStep + " " + vStep);
		int i = 1;
		while(i++ <= 15){
			g.drawLine(0, vStep * i, hStep * i, height);
			g.drawLine(width, vStep * i, hStep * i, 0);
			g.drawLine(hStep * i, 0, 0, height - vStep * i);
			g.drawLine(hStep * i, height, width, height - vStep * i);
		}
	}
	
	public static void main(String[] args){
		Unit3Activity3D panel = new Unit3Activity3D();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize(400, 400);
		application.setVisible(true);
	}
}

