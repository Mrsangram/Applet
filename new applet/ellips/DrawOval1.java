import java.applet.*;
import java.awt.*;

public class DrawOval1 extends Applet{

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(20,20,50,60); //or drawOval();
    }
}



//<applet code="DrawOval1.class" height="250" width="200"></applet>