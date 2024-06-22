// <applet code="DrawRect.class" width=700 height=500> </applet>
import java.applet.*;
import java.awt.*;

public class DrawRect extends Applet {
    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(10, 20, 100, 100);
        g.drawRect(150, 20, 200, 80);
        g.drawRect(400, 20, 90, 150);
    }
}