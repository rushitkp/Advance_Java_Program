
// Pr 24
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="Scrollbar1.class" width=400 height=300> </applet> */
public class Scrollbar1 extends Applet implements AdjustmentListener {
    String msg = "";
    Scrollbar vertSB, horzSB;
    Label lb;

    public void init() {
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 200, 0, 0, 1000);
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 200, 0, 400);
        lb = new Label();
        add(vertSB);
        add(horzSB);
        add(lb);
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae) {
        msg = "Vertical : " + vertSB.getValue();
        msg += " ; Horizontal" + horzSB.getValue();
        lb.setText(msg);
    }
}