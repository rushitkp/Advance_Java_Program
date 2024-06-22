import java.applet.Applet;
import java.awt.*;

/* <applet code="FontCls.class" width=500 height=600> </applet> */
public class FontCls extends Applet {
    public void paint(Graphics g) {
        g.drawString("Good Morning", 10, 50);
        Font f1 = new Font("Dialog", Font.ITALIC, 30);
        g.setFont(f1);
        g.drawString("Good Morning", 10, 100);
        Font f2 = new Font("Monospaced", Font.BOLD, 30);
        g.setFont(f2);
        g.drawString("Good Morning", 10, 150);
        g.setFont(new Font("SansSerif", Font.PLAIN, 30));
        g.drawString("Good Morning", 10, 200);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 30));
        g.drawString("Good Morning", 10, 250);
        g.setFont(new Font("Courier", Font.BOLD, 30));
        g.drawString("Good Morning", 10, 300);
    }
}