/*<applet code="SimpleAppletGUI.class" width=400 height=500> </applet> */

import java.awt.*;
import java.applet.*;

public class SimpleAppletGUI extends Applet {
    public void init() {
        Label nameLabel = new Label("Name:");
        add(nameLabel);

        TextField nameTextField = new TextField(20);
        add(nameTextField);

        Button submitButton = new Button("Submit");
        add(submitButton);

        TextArea resultTextArea = new TextArea(5, 30);
        add(resultTextArea);
    }

    public void start() {
        setSize(300, 200);
    }
}
