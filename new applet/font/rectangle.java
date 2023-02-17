 import java.applet.*;
 import java.awt.*;
 
 
 public class rectangle extends Applet
 {
	 public void paint(Graphics g)
	 {
		 g.setColor(Color.green);
		 g.drawLine(20,20,100,20);
		 g.setColor(Color.red);
		 g.drawLine(20,20,20,100);
		 g.setColor(Color.blue);
		 g.drawLine(100,20,20,100);
		 
	 }
 }