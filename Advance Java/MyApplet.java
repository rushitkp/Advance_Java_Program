/* <applet code="MyApplet.class" width=400 height=400> </applet>  */
import java.applet.Applet;
import java.awt.Graphics;
public class MyApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("My First Applet Program", 30, 50);
    }
}