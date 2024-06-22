
// Pr 20
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="TextArea1.class" width=500 height=500> </applet> */
public class TextArea1 extends Applet implements ActionListener, TextListener {
    TextArea ta;
    TextField tf;
    Label lb1, lb2;

    public void init() {
        lb1 = new Label("Enter Your Text : ", Label.RIGHT);
        tf = new TextField(30);
        lb2 = new Label("Text Area : ", Label.RIGHT);
        ta = new TextArea("Shri C.J. Patel College", 20, 30);
        add(lb1);
        add(tf);
        add(lb2);
        add(ta);
        tf.addTextListener(this);
        tf.addActionListener(this);
    }

    public void textValueChanged(TextEvent te) {
        ta.append("\n TextEvent : " + tf.getText());
    }

    public void actionPerformed(ActionEvent ae) {
        ta.append("\n ActionEvent : " + ae.getActionCommand());
        tf.setText(" ");
    }
}