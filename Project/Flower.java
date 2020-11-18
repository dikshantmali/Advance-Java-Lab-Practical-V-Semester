/*
Project = Drawing a Flower and enlarging and shrinking its size

Creator - Dikshant Mali
V-CSA
Registration no. = PIET18CS049
Poornima institute of engineering and technology


*/

import java.applet.Applet;  
import java.awt.*; 
import java.awt.event.*; 
/*<applet code="Flower" width="700" height="700"> </applet>*/
public class Flower extends Applet implements ActionListener
{
	Button b1,b2,b0;
	boolean draw_flower=false,increase=false,decrease=false;
	public void paint(Graphics g)
	{  
        
		g.drawString("Sizable Flower Created By Dikshant Mali",230,30);  
		if(draw_flower == true)
		{

			
			g.setColor(Color.pink);
			g.fillOval(320,177,70,70);


			g.setColor(Color.pink);
			g.fillOval(267,220,70,70);

			g.setColor(Color.pink);
			g.fillOval(373,220,70,70);


			g.setColor(Color.pink);
			g.fillOval(288,270,70,70);


			g.setColor(Color.pink);
			g.fillOval(353,270,70,70);


			g.setColor(Color.green);
			g.fillOval(320,230,70,70);


			g.setColor(Color.blue);
			g.drawArc(36,203,320,230,0,-60);	  
		}
		if(increase == true)
		{ 
			
			g.setColor(Color.pink);
			g.fillOval(320,157,120,120);


			g.setColor(Color.pink);
			g.fillOval(247,220,120,120);

			g.setColor(Color.pink);
			g.fillOval(393,220,120,120);


			g.setColor(Color.pink);
			g.fillOval(266,300,120,120);


			g.setColor(Color.pink);
			g.fillOval(373,300,120,120);


			g.setColor(Color.green);
			g.fillOval(320,230,120,120);


			g.setColor(Color.blue);
			g.drawArc(60,215,320,350,0,-70);


		}
		if(decrease == true)
		{  
			g.setColor(Color.pink);
			g.fillOval(320,205,30,30);


			g.setColor(Color.pink);
			g.fillOval(300,220,30,30);

			g.setColor(Color.pink);
			g.fillOval(338,220,30,30);


			g.setColor(Color.pink);
			g.fillOval(305,245,30,30);

			g.setColor(Color.pink);
			g.fillOval(334,245,30,30);





			g.setColor(Color.green);
			g.fillOval(320,230,30,30);


			g.setColor(Color.blue);
			g.drawArc(214,200,120,130,0,-60);	

		}
	}
	public void init()
	{
		b0 = new Button("Draw Flower");
		b1 = new Button("Increase Size");
		b2 = new Button("Decrease Size");

		setLayout(null);

		b0.setBounds(450,70,120,40);
		b1.setBounds(50,70,120,40);
		b2.setBounds(200,70,120,40);
		
		b1.addActionListener(this); 
		b2.addActionListener(this); 

		b0.addActionListener(this); 
		add(b0);
		add(b1);
		add(b2);


	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b0)
		{
			draw_flower = true;
			increase = false;
			decrease =false;
		}
		else if(e.getSource()==b1)
		{
			increase = true;
			decrease = false;
			draw_flower = false;
		}
		else
		{
			decrease = true;
			increase = false;
			draw_flower = false;

		}
		repaint();
	}
}  