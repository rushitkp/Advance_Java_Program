// Pr 22
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="ChoiceEx.class" width=400 height=500> </applet> */
public class ChoiceEx extends Applet implements ItemListener {
    Label lb1, lb2;
    Choice browser;
    String msg = "";

    public void init() {
        setLayout(null);
        lb1 = new Label("Select Browser : ", Label.RIGHT);
        lb2 = new Label();
        browser = new Choice();
        browser.add("Internet Explorer");
        browser.add("Google Chrome");
        browser.add("Mozila Firefox");
        browser.add("Opera");
        browser.add("Safari");
        lb1.setBounds(10, 50, 120, 20);
        browser.setBounds(130, 50, 200, 20);
        lb2.setBounds(10, 100, 400, 20);
        add(lb1);
        add(browser);
        add(lb2);
        browser.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        msg = "You selected : " + browser.getSelectedItem();
        lb2.setText(msg);
    }
}