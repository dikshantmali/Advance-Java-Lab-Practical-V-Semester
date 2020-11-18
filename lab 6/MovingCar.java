
import java.applet.*;
import java.awt.*;
import java.lang.*;

/*<applet code="MovingStar" height=800 width=1000>
</applet> */
public class MovingStar extends Applet implements Runnable
{ 
 int x1[]= {100,146,160,179,223,186,197,162,122,138};
 int y1[] = {150,147,95,147,149,180,231,200,228,181};
 public void init()
 {
  setBackground(new Color(120,25,35));
 }
 public void start(){
  Thread th = new Thread (this);
  th.start();
 }
public void paint(Graphics g)
{

  g.setColor(Color.white);
  g.fillPolygon(x1,y1,10);
 
}
public void run()
{
  while(true)
  {
    for(int i=0;i<10;i++)
    {
      x1[i] = x1[i] + 1;
    }
    repaint();
    try{
      Thread.sleep(20);

    }
    catch(InterruptedException ex )
    {
      System.out.println("Exception caught");
    }
  }
}
}