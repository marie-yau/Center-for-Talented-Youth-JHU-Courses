import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Marie Dohnalová
 * This program draws a square-shaped spiral centered on the panel.
 * 
 */

public class Unit6Activity1A extends JPanel{

	public void paintComponent(Graphics g){
		
		g.setColor(Color.RED);
		
		int w=this.getWidth();
		int h=this.getHeight();
		
		int l=20;
		int dir=0;
		
		int x=w/2, y=h/2;
		
		while(l<=w || l<=h){
			switch(dir){
			case 0:
				g.drawLine(x, y, x, y+l);
				y+=l;
				break;
			case 1:
				g.drawLine(x, y, x-l, y);
				x-=l;
				break;
			case 2:
				g.drawLine(x, y, x, y-l);
				y-=l;
				break;
			case 3:
				g.drawLine(x, y, x+l, y);
				x+=l;
				break;
			}
			dir=(dir+1)%4;
			if(dir%2==0) l+=20;
		}
	}
	
	public static void main(String[] args) {
		Unit6Activity1A panel=new Unit6Activity1A();
		
		JFrame application=new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize( 400, 400 );
		application.setVisible( true );
	}

}
