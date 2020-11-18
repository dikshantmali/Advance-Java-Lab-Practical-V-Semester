
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code=Mouse width=800 height=700>
</applet>*/
public class Mouse extends Applet implements MouseListener,MouseMotionListener
{
int X=50,Y=50;
String message="MOUSE EVENTS";
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
setBackground(Color.black);
setBackground(Color.white);
}
public void mouseEntered(MouseEvent me){
message="MOUSE ENTERED";
setBackground(Color.white);
showStatus("Mouse Entered");
repaint();
}
public void mouseExited(MouseEvent me){
message="MOUSE EXITED";
setBackground(Color.pink);
showStatus("Mouse Exited");
repaint();
}
public void mousePressed(MouseEvent me){
message="MOUSE PRESSED";
setBackground(Color.orange);
showStatus("Mouse Pressed");
repaint();
}
public void mouseReleased(MouseEvent me){
message="MOUSE RELEASED";
setBackground(Color.yellow);
showStatus("Mouse Released");
repaint();
}
public void mouseMoved(MouseEvent me){
message="MOUSE MOVED";
X=me.getX();
Y=me.getX();
setBackground(Color.green);
showStatus("Mouse Moved");
repaint();
}
public void mouseDragged(MouseEvent me){
message="MOUSE DRAGGED";
setBackground(Color.blue);
showStatus("Mouse Dragged at("+me.getX()+","+me.getY()+")");
repaint();
}
public void mouseClicked(MouseEvent me){
message="MOUSE CLICKED";
setBackground(Color.red);
showStatus("Mouse Clicked");
repaint();
}
public void paint(Graphics g){
g.drawString(message,X,Y);
}
}