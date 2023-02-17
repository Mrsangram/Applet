 import java.applet.*;
 import java.awt.*;
 
 
 public class font_style1 extends Applet
 {
	 Font obj = new Font("Algerian",Font.BOLD,200);
	 Font obj1 = new Font("Wide Latin",Font.BOLD,100);
	 
	 public void paint(Graphics g)
	 {
		 g.setColor(Color.red);
		 g.setFont(obj);
		 g.drawString("WELCOME ",320,300);
		 
		 g.setColor(Color.green);
		 g.setFont(obj1);
		 g.drawString("Hacker.Security ",100,100);
		 
	 }
 }