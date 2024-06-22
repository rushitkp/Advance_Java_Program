
// Pr 23
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="List1.class" width=500 height=500> </applet> */
public class List1 extends Applet implements ActionListener {
    List cls, sub;
    String msg = new String();
    Label lb1, lb2;

    public void init() {
        cls = new List(4);
        sub = new List(5, true);
        lb1 = new Label();
        lb2 = new Label();
        cls.add("FYBCA");
        cls.add("SYBCA");
        cls.add("TYBCA");
        cls.add("PGDCA");
        cls.select(2);
        sub.add("C LANG");
        sub.add("CO");
        sub.add("C++");
        sub.add("ADBMS");
        sub.add("JAVA");
        sub.add("PHP");
        add(cls);
        add(sub);
        add(lb1);
        add(lb2);
        cls.addActionListener(this);
        sub.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ie) {
        msg = "CLASS : ";
        msg += cls.getSelectedItem();
        lb1.setText(msg);
        int idx[] = new int[5];
        msg = "SUBJECTS : ";
        idx = sub.getSelectedIndexes();
        for (int i = 0; i < idx.length; i++)
            msg += "[" + sub.getItem(idx[i]) + "]";
        lb2.setText(msg);
    }
}