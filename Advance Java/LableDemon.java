import java.awt.*;
import java.applet.*;

/*<Applet code="LabelDemo.class" width=500 height=300> </Applet> */
public class LabelDemo extends Applet {
    public void init() {
        Label no = new Label("SNO");
        Label name = new Label("SNAME");
        add(no);
        add(name);
    }
}