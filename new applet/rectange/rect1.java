import java.applet.*;
import java.awt.*;

public class rect1 extends Applet{

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawRect(20,20,150,160);
        g.fillRect(220,120,50,60);
    }
}



//<applet code="rect1.class" height="250" width="200"></applet>