
import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;  
/* <APPLET CODE=ScrollingText.class WIDTH=500 HEIGHT=300 > </APPLET> */ 
public class ScrollingText  extends Applet implements Runnable 
{ 
	String msg="This Scrolling effect is created by dikshant mali .......    "; 
	Thread t=null; 
	public void init() 
	{ 
		setBackground(Color.yellow); 
		setForeground(Color.black); 
		t=new Thread(this); 
		t.start(); 
	}  
	public void run() 
	{ 
		char ch; 
		for(; ;) 
		{ 
			try 
			{ 
				repaint(); 
				Thread.sleep(400); 
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch; 
			} 
			catch(InterruptedException e) 
			{} 
		} 
	} 
	public void paint(Graphics g) 
	{ 
             g.drawString(msg,10,10); 
         } 
     }
