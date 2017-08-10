import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marie Dohnalová
 * This program draws a circular spiral centered on the panel.
 * 
 */
public class Unit6Activity1B extends JPanel{

	public void paintComponent(Graphics g){
	
		g.setColor(Color.BLUE);
		
		int w=this.getWidth();
		int h=this.getHeight();
		
		int r=20;
		int dir=0;
		
		int center=w/2;
		
		while(r<=w){
			switch(dir){
			case 0:
				g.drawArc(center-r, h/2-r, r*2, r*2, 0, 180);
				center-=20;
				break;
			case 1:
				g.drawArc(center-r, h/2-r, r*2, r*2, 180, 180);
				center+=20;
				break;
			}
			dir=1-dir;
			r+=20;
		}
	}
	
	public static void main(String[] args) {
		Unit6Activity1B panel=new Unit6Activity1B();
		
		JFrame application=new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add( panel );
		application.setSize( 400, 400 );
		application.setVisible( true );
	}

}