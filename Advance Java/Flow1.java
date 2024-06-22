
// Pr 25
import java.awt.*;
import java.applet.*;

/* <applet code="Flow1.class" width=200 height = 300> </applet> */
public class Flow1 extends Applet {
    String str;
    Checkbox java, net, php, dwm, se;

    public void init() {
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 20, 20);
        setLayout(f);
        java = new Checkbox("JAVA");
        net = new Checkbox(".NET");
        php = new Checkbox("PHP");
        dwm = new Checkbox("DWM");
        se = new Checkbox("SE");
        add(java);
        add(net);
        add(php);
        add(dwm);
        add(se);
    }
}