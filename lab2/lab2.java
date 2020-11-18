import java.applet.Applet;
import java.awt.*;
public class lab2 extends Applet
{
	Button b1; 
	Label lm,l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4,t5;
	public void init()
	{
		lm = new Label("Provide Your Business Detail Below");
		l1 = new Label("Full Name : ");
		l2 = new Label("Business Name : ");
		l3 = new Label("Email : ");
		l4 = new Label("Contact Number : ");
		l5 = new Label("Address : ");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		
		b1 = new Button("Submit Detail");
		setLayout(null);
		lm.setBounds(160,10,500,40);
		l1.setBounds(60,50,100,20);
		l2.setBounds(60,100,100,20);
		l3.setBounds(60,150,100,20);
		l4.setBounds(60,200,100,20);
		l5.setBounds(60,250,100,20);
		t1.setBounds(180,50,150,20);
		t2.setBounds(180,100,150,20);
		t3.setBounds(180,150,150,20);
		t4.setBounds(180,200,150,20);
		t5.setBounds(180,250,150,20);
		b1.setBounds(210,300,80,20);	
		add(lm);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(b1);
	}
} 