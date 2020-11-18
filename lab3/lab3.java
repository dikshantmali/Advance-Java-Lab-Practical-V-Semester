import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "lab3" width = "500" height = "700"> </applet>*/
public class lab3 extends Applet
{
	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField t1,t2;
	public void init()
	{
		l1 = new Label("First Number");
		l2 = new Label("Second Number");
		l3 = new Label();
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("Add");
		b2 = new Button("Subtract");
		b3 = new Button("Multiply");
		b4 = new Button("Devide");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		b2.setBounds(100,200,80,20);
		b3.setBounds(100,250,80,20);
		b4.setBounds(100,300,80,20);
		l3.setBounds(100,350,160,20);	
		add(l2);
		add(t1);
		add(l1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		b1.addActionListener(new MyHandler());
		b2.addActionListener(new MyHandler1());
		b3.addActionListener(new MyHandler2());
		b4.addActionListener(new MyHandler3());
	}
	public class MyHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sum;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			sum=a+b;
			l3.setText("Sum is = " + sum);
		}
	}
	public class MyHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,sub;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			sub=a-b;
			l3.setText("Subtraction is = " + sub);
		}
	}public class MyHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,mul;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			mul=a*b;
			l3.setText("Multiplication is = " + mul);
		}
	}public class MyHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b;
			double div;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			div=a/b;
			l3.setText("Division is = " + div);
		}
	}
			
}