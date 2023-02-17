import java.applet.Applet;
import java.awt.Graphics;

public class paramiter extends Applet
{
	public void paint(Graphics g)
	{
		String str=this.getParameter("HELLO Student");
		g.drawString(str,100,80);
	}
}