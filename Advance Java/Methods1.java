/* <applet code="Methods1.class" width=700 height=500> </applet>
*/
import java.applet.Applet;
import java.awt.Graphics;

public class Methods1 extends Applet {
	String msg = " ";

	public void init() {
		msg = "[Applet Initialized] ";
	}

	public void start() {
		msg += "[Applet Started] ";
	}

	public void stop() {
		msg += "[Applet Stopped] ";
	}

	public void destroy() {
		System.out.println("Applet Destroyed");
	}

	public void paint(Graphics g) {
		g.drawString(msg, 20, 30);
	}
}