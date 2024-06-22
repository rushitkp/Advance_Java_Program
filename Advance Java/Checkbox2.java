
// Pr 21
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="Checkbox2.class" width=400 height=400> </applet> */
public class Checkbox2 extends Applet implements ItemListener {
    Label lb1, lb2, lb3;
    Checkbox cb1, cb2, cb3;
    String msg = new String();

    public void init() {
        cb1 = new Checkbox("Apple");
        cb2 = new Checkbox("Orange");
        cb3 = new Checkbox("Banana");
        lb1 = new Label("");
        lb2 = new Label("");
        lb3 = new Label("");
        add(cb1);
        add(cb2);
        add(cb3);
        add(lb1);
        add(lb2);
        add(lb3);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        msg = cb1.getLabel();
        msg += (cb1.getState() == true) ? " = Checked" : " = Unchecked";
        lb1.setText(msg);
        msg = cb2.getLabel();
        msg += (cb2.getState() == true) ? " = Checked" : " = Unchecked";
        lb2.setText(msg);
        msg = cb3.getLabel();
        msg += (cb3.getState() == true) ? " = Checked" : " = Unchecked";
        lb3.setText(msg);
    }
}