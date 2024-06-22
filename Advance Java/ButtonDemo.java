
// Pr 19
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="ButtonDemo.class" width=500 height=300> </applet> */
public class ButtonDemo extends Applet implements ActionListener {
    String msg = new String();
    Label lbl;
    Button yes, no, cancel;

    public void init() {
        setLayout(new FlowLayout());
        yes = new Button("YES");
        no = new Button("NO");
        cancel = new Button("CANCEL");
        lbl = new Label("Press any Button");
        add(yes);
        add(no);
        add(cancel);
        add(lbl);
        yes.addActionListener(this);
        no.addActionListener(this);
        cancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("YES"))
            msg = "YES Button Pressed";
        else if (str.equals("NO"))
            msg = "NO Button Pressed";
        else
            msg = "CANCEL Button Pressed";
        lbl.setText(msg);
    }
}