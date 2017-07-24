import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marie Dohnalová
 * This program will display bull´s eye with random colors.
 * Exercise 5.1.
 */
public class Unit5Activity2A extends JPanel{
	
	public void paintComponent(Graphics g){
		int width=getWidth(), height=getHeight();
		
		Color color1=new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		Color color2=new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		
		int i=5;
		while(i>0){
			int radius=i*10;
			if(i%2==0)
				g.setColor(color1);
			else
				g.setColor(color2);
			g.fillOval(width/2-radius, height/2-radius, 2*radius, 2*radius);
			i--;
		}
	}
	
	public static void main(String[] args){
		Unit5Activity2A panel=new Unit5Activity2A();
		
		JFrame application=new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize( 400, 400 );
		application.setVisible( true );
	}
}
