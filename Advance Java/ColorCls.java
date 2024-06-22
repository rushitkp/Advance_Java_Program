import java.applet.*;
import java.awt.*;

/* <applet code="ColorCls.class" width=700 height=500> </applet>  */
public class ColorCls extends Applet 
{
    public void paint(Graphics g) 
    { 
        Color r1 = new Color(255, 0, 0);   // red
        g.setColor(r1);
        g.fillRect(10, 50, 80, 80);
        Color c = g.getColor();
        String s = c.toString();
        g.drawString(s, 0, 160);           // java.awt.Color[r=255,g=0,b=0]
        Color b1 = new Color(0, 0, 255);   // blue
        g.setColor(b1);
        g.fillOval(180, 50, 100, 100);
        Color g1 = new Color(0, 255, 0);   // green
        g.setColor(g1);
        g.fillRoundRect(350, 50, 100, 100, 50, 40);
    }
}