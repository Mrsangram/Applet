 import java.applet.*;
 import java.awt.*;
 
 
 public class font_style extends Applet
 {
	 Font obj = new Font("Algerian",Font.BOLD,100);
	 public void paint(Graphics g)
	 {
		 g.setFont(obj);
		 g.drawString("Hello Hacker.Security",220,200);
	 }
 }