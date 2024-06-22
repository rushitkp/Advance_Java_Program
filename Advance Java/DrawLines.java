 /* <applet code="DrawLines.class" width=700 height=500>
</applet>
*/
import java.applet.*;
import java.awt.*;

public class DrawLines extends Applet {
    public void init() {
        setBackground(Color.black);
        setForeground(Color.blue);
    }

    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.drawLine(150, 100, 150, 100); // draw point
        g.drawLine(200, 50, 300, 50);
        g.drawLine(350, 50, 350, 150);
        g.drawRect(150, 20, 200, 80);
        g.drawRoundRect(100, 200, 100, 100, 600, 500);
        g.fillRoundRect(150, 20, 200, 80, 80, 60);
        g.drawRoundRect(400, 20, 90, 150, 50, 80);
        g.draw3DRect(25, 10, 50, 75, true);
        g.draw3DRect(25, 110, 50, 75, false);
        g.fill3DRect(100, 10, 50, 75, true);
        g.fill3DRect(100, 110, 50, 75, false);
        g.drawOval(10, 20, 100, 100);
        g.fillOval(150, 20, 200, 80);
        g.drawOval(400, 20, 90, 150);
        g.drawArc(10, 40, 70, 70, 0, 75);
        g.drawArc(200, 40, 70, 80, 0, 180);
        g.fillArc(300, 40, 70, 70, 0, 75);
        g.fillArc(10, 150, 70, 90, 0, 270);
        g.fillArc(200, 150, 80, 80, 0, 180);
        g.fillArc(300, 150, 80, 80, 90, -180);
        g.fillArc(10, 250, 80, 80, 0, -180);
    }
}