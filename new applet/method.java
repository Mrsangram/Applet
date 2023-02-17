import java.applet.Applet;
import java.awt.Graphics;

public class method extends Applet
{
	int count =1;
	
	public void init()
	{
		System.out.println("init method"+count++);
	}
	public void start()
	{
		System.out.println("Start Method"+count++);
	}
	public void stop()
	{
		System.out.println("Stop Method"+count++);
	}
	public void distroy()
	{ 	
	   System.out.println("Distroy Method"+count++);
	}
	public void paint(Graphics g)
	{
		System.out.println("Paint method "+count++);
		 g.drawString("Welcome TO Hacker Sir",50,20);
	}
}
		