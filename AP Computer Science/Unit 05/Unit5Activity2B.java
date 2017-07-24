import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marie Dohnalová
 * This program will display 10 random shapes in random colors.
 * Exercise 5.2.
 */
public class Unit5Activity2B extends JPanel{
	
	public void paintComponent(Graphics g){
		int width=getWidth(), height=getHeight();
		
		
		for(int i=0;i<10;i++){
			int x=(int)(Math.random()*width);
			int y=(int)(Math.random()*height);

			int w=(int)(Math.random()*width/2);
			int h=(int)(Math.random()*height/2);
			
			Color color=new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
			g.setColor(color);
			
			//Rect
			if(Math.random()>=0.5){
				g.fillRect(x, y, w, h);
			}
			//Oval
			else{
				g.fillOval(x, y, w, h);
			}
		}
	}
	
	public static void main(String[] args){
		Unit5Activity2B panel=new Unit5Activity2B();
		
		JFrame application=new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize( 400, 400 );
		application.setVisible( true );
	}
}