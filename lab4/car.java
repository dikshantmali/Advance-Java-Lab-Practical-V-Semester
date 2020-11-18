import java.applet.Applet;  
import java.awt.*;  
 /*<applet code="car" width="1000" height="1000"> </applet>*/
public class car extends Applet
	{
		public void paint(Graphics g)
			{    
				g.drawString("Car",380,30);
				g.setColor(Color.gray);
				g.fillRect(225,300,200,200);  
				g.setColor(Color.blue);
				g.fillRect(100,400,450,150);
				g.setColor(Color.red);
				g.fillOval(200,548,70,70);
				g.fillOval(400,548,70,70);
				
				
	}  
}