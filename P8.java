/*
<applet code="P8.class" height=300 width=300></applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*public class P8 extends Applet implements ActionListener
{
	Button b;
	Label l,l1,l2,l3;
	TextField tf,tf1,tf2;
	public void init() 
	{
		b = new Button("Calculate");
		tf= new TextField(20);
		tf1= new TextField(10);
		tf2= new TextField(10);
		
		l = new Label("Product Name");
		l1 = new Label("Base Price");
		l2 = new Label("GST(%)");
		l3 = new Label("Final Price");
		
		add(l);
		add(tf);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		add(l3);
		b.addActionListener(this);
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		String val=tf.getText()+" : ";
		float a=Float.parseFloat(tf1.getText());
		float b=Float.parseFloat(tf2.getText());
		
		l3.setText(val+(a+(a*(b/100))));
	}
}*/


// 1. everything in main method or Anonamious class
public class P8
{
	
	public static void main(String args[])
	{
		Frame f;
		Button b;
		Label l,l1,l2,l3;
		TextField tf,tf1,tf2;	
		
		f = new Frame("My Frame");
		b = new Button("Calculate");
		tf= new TextField(20);
		tf1= new TextField(10);
		tf2= new TextField(10);
		
		l = new Label("Product Name");
		l1 = new Label("Base Price");
		l2 = new Label("GST(%)");
		l3 = new Label("Final Price");
		
		f.add(l);
		f.add(tf);
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(b);
		f.add(l3);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String val=tf.getText()+" : ";
				float a=Float.parseFloat(tf1.getText());
				float b=Float.parseFloat(tf2.getText());
				
				l3.setText(val+(a+(a*(b/100))));
			}	
		});
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
		f.setVisible(true);
	}
	
}
/*
// 2.by extends and Implementing Listner 
public class P8 extends Frame implements ActionListener
{
	Button b;
	Label l,l1,l2,l3;
	TextField tf,tf1,tf2;	
		
	public P8()
	{
		super("My Frame");
		b = new Button("Calculate");
		tf= new TextField(20);
		tf1= new TextField(10);
		tf2= new TextField(10);
		
		l = new Label("Product Name");
		l1 = new Label("Base Price");
		l2 = new Label("GST(%)");
		l3 = new Label("Final Price");
		
		add(l);
		add(tf);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		add(l3);
		b.addActionListener(this);
			
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String val=tf.getText()+" : ";
		float a=Float.parseFloat(tf1.getText());
		float b=Float.parseFloat(tf2.getText());
		
		l3.setText(val+(a+(a*(b/100))));
	}	
	public static void main(String args[])
	{
		new P8();
	}
	
}*/

/*
//3. seperate main class
class MyFrame extends Frame implements ActionListener
{
	Button b;
	Label l,l1,l2,l3;
	TextField tf,tf1,tf2;	
		
	public MyFrame()
	{
		super("My Frame");
		b = new Button("Calculate");
		tf= new TextField(20);
		tf1= new TextField(10);
		tf2= new TextField(10);
		
		l = new Label("Product Name");
		l1 = new Label("Base Price");
		l2 = new Label("GST(%)");
		l3 = new Label("Final Price");
		
		add(l);
		add(tf);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		add(l3);
		b.addActionListener(this);
			
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String val=tf.getText()+" : ";
		float a=Float.parseFloat(tf1.getText());
		float b=Float.parseFloat(tf2.getText());
		
		l3.setText(val+(a+(a*(b/100))));
	}	
}
public class P8
{
	public static void main(String args[])
	{
		MyFrame f=new MyFrame();
	}
}	
*/

/*
//4. inner class
class MyFrame extends Frame
{
	Button b;
	Label l,l1,l2,l3;
	TextField tf,tf1,tf2;	
		
	public MyFrame()
	{
		super("My Frame");
		b = new Button("Calculate");
		tf= new TextField(20);
		tf1= new TextField(10);
		tf2= new TextField(10);
		
		l = new Label("Product Name");
		l1 = new Label("Base Price");
		l2 = new Label("GST(%)");
		l3 = new Label("Final Price");
		
		add(l);
		add(tf);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		add(l3);
		b.addActionListener(new MyListener());
			
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			String val=tf.getText()+" : ";
			float a=Float.parseFloat(tf1.getText());
			float b=Float.parseFloat(tf2.getText());
			
			l3.setText(val+(a+(a*(b/100))));
		}
	}	
}
public class P8
{
	public static void main(String args[])
	{
		MyFrame f=new MyFrame();
	}
}
*/

//5. Seperate every class
class MyFrame extends Frame
{
	Button b;
	Label l,l1,l2,l3;
	TextField tf,tf1,tf2;	
		
	public MyFrame()
	{
		super("My Frame");
		b = new Button("Calculate");
		tf= new TextField(20);
		tf1= new TextField(10);
		tf2= new TextField(10);
		
		l = new Label("Product Name");
		l1 = new Label("Base Price");
		l2 = new Label("GST(%)");
		l3 = new Label("Final Price");
		
		add(l);
		add(tf);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		add(l3);
	
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	public void setListener(MyListener ml)
	{
		b.addActionListener(ml);
	}
	
}
class MyListener implements ActionListener
{
	MyFrame f;
	MyListener(MyFrame f)
	{
		this.f=f;
	}
	public void actionPerformed(ActionEvent ae)
	{
		String val=f.tf.getText()+" : ";
		float a=Float.parseFloat(f.tf1.getText());
		float b=Float.parseFloat(f.tf2.getText());
		
		f.l3.setText(val+(a+(a*(b/100))));
	}
}
public class P8
{
	public static void main(String args[])
	{
		MyFrame f=new MyFrame();
		MyListener ml=new MyListener(f);
		f.setListener(ml);
	}
}