
// Pr 26
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener {
    Label lb1;

    public MenuDemo() {
        lb1 = new Label();
        MenuBar mbar = new MenuBar(); // create menu bar
        setMenuBar(mbar); // add menu bar to frame

        // create menus – BCA, Exit
        Menu bca = new Menu("BCA");
        Menu exit = new Menu("Exit");
        // add menus to menu bar
        mbar.add(bca);
        mbar.add(exit);
        // create menu items for BCA menu
        MenuItem first = new MenuItem("FYBCA");
        MenuItem second = new MenuItem("SYBCA");
        // CheckboxMenuItem second = new CheckboxMenuItem("SYBCA", true);
        Menu third = new Menu("TYBCA");
        // add menu items to bca menu
        bca.add(first);
        bca.add(second);
        bca.add(third);
        // create submenu items for TYBCA menu
        MenuItem ty1 = new MenuItem("JAVA");
        MenuItem ty2 = new MenuItem("PHP");
        third.add(ty1);
        third.add(ty2);
        exit.add(new MenuItem("Close"));
        bca.addActionListener(this);
        third.addActionListener(this);
        exit.addActionListener(this);
        add(lb1);
        setTitle("Use of Menu");
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("FYBCA"))
            lb1.setText("FYBCA is selected");
        else if (str.equals("SYBCA"))
            lb1.setText("SYBCA is selected");
        else if (str.equals("JAVA"))
            lb1.setText("JAVA is selected");
        else if (str.equals("PHP"))
            lb1.setText("PHP is selected");
        else if (str.equals("Close"))
            System.exit(0);
    }

    public static void main(String args[]) {
        new MenuDemo();
    }
}