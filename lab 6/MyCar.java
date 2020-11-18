import java.applet.Applet;  
import java.awt.*;  
 /*<applet code="MyCar" width="500" height="600"> </applet>*/
public class MyCar extends Applet
	{
		public void paint(Graphics g)
			{  
				g.setColor(Color.red);  
				//g.drawString("Welcome",50, 50);  
				
				g.fillRect(125,300,200,50);  
				//g.fillRect(170,100,30,30);
				g.setColor(Color.black);				
				g.fillOval(150,335,30,30);
				g.fillOval(250,335,30,30);
				g.setColor(Color.yellow);
				g.fillOval(160,345,10,10);
				g.fillOval(260,345,10,10);
				g.fillRect(185,250,75,50);
				g.setColor(Color.gray);
				g.fillArc(160,250,50,100,90,90);
				//g.drawLine(160,300,185,250);
				//g.drawLine(185,250,260,250);
				//g.drawLine(260,250,260,300);
				
				//g.setColor(Color.pink);  
				//g.fillOval(170,200,30,30);  
				//g.drawArc(90,150,30,30,30,270);  
				//g.fillArc(270,150,30,30,0,180);  
			}
	}   