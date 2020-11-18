import java.applet.Applet;  
import java.awt.*;  
 /*<applet code="house" width="1000" height="1000"> </applet>*/
public class house extends Applet
	{
		public void paint(Graphics g)
			{    
				g.drawString("House",380,30);  
				g.setColor(Color.blue);
				g.drawLine(200,200,600,200);
				g.drawLine(200,200,400,40);
				g.drawLine(600,200,400,40);
				g.setColor(Color.red);
				g.fillRect(200,200,402,402);
				g.setColor(Color.yellow);
				g.fillRect(300,352,200,250);
				g.setColor(Color.green);
				g.fillOval(450,450,30,30);	  
			}
	}  